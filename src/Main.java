import combat.CombatManager;
import enemies.Enemy;
import enemies.Zombie;
import items.HealthElixir;
import items.ItemManager;
import level.LevelManager;
import player.Player;
import score.ScoreManager;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Hero");
        CombatManager combatManager = new CombatManager();
        LevelManager levelManager = new LevelManager();
        ItemManager itemManager = new ItemManager();
        ScoreManager scoreManager = new ScoreManager();

        levelManager.startLevel(1);
        Enemy enemy = new Zombie();
        itemManager.pickUp(player, new HealthElixir());
        combatManager.fight(player, enemy);
        scoreManager.updateScore(100);
    }
}