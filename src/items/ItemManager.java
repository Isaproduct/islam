package items;

import player.Player;

public class ItemManager {
    public void pickUp(Player player, Item item) {
        System.out.println("Picked up: " + item.getName());
        player.addItem(item);
    }
}