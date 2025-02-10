package combat;

import enemies.Enemy;
import player.Player;

import java.util.Random;
import java.util.Scanner;

public class CombatManager {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public void fight(Player player, Enemy enemy) {
        System.out.println(enemy.getName() + " appears");
        while (player.getHealth() > 0 && enemy.alive()) {
            System.out.println("Player HP: " + player.getHealth() + " | Enemy HP: " + enemy.getHealth());
            System.out.println("Choose: 1 - Attack, 2 - Defend, 3 - Use health elixir");
            int choice = scanner.nextInt();
            if (choice == 1) {
                int damage = 20;
                if (random.nextInt(100) < 25) {
                    damage *= 2;
                    System.out.println("Critical hit!");
                }
                enemy.takeDamage(damage);
            } else if (choice == 2) {
                System.out.println("You defend, reducing enemy damage");
                player.takeDamage(enemy.getAttackPower() / 2);
                continue;
            } else if (choice == 3) {
                player.useHealthElixir();
                continue;
            }
            player.takeDamage(enemy.getAttackPower());
        }
        if (!enemy.alive()) {
            System.out.println("Enemy defeated");
            player.addExperience(50);
        }
    }
}
