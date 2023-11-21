package inventory;

import model.InventoryItem;
import java.util.HashMap;
import java.util.Map;

// Singleton class to manage inventory
public class InventoryManager {
    private static InventoryManager instance;
    private Map<String, InventoryItem> inventory;

    // Private constructor for singleton
    private InventoryManager() {
        this.inventory = new HashMap<>();
    }

    // Method to get the single instance of InventoryManager
    public static synchronized InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    // Method to add a product to the inventory
    public void addProduct(InventoryItem item) {
        inventory.put(item.getProduct().getId(), item);
    }

    // Additional methods...
}
