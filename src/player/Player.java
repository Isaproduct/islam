package player;

import items.Inventory;
import items.Item;

public class Player {
    private String name;
    private int health = 100;
    private int experience = 0;
    private Inventory inventory = new Inventory();

    public Player(String name) {
        this.name = name;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(name + " died");
        }
    }

    public void addExperience(int xp) {
        experience += xp;
    }

    public void addItem(Item item) {
        inventory.addItem(item);
    }

    public void useHealthElixir() {
        if (inventory.elixir()) {
            health += 30;
            System.out.println(name + " used a health elixir and restored 30 HP");
            inventory.delete();
        } else {
            System.out.println("No health elixir available");
        }
    }

    public int getHealth() {
        return health;
    }
}