package items;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added: " + item.getName());
    }

    public boolean elixir() {
        return items.stream().anyMatch(item -> item instanceof HealthElixir);
    }

    public void delete() {
        items.removeIf(item -> item instanceof HealthElixir);
    }
}