import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    private Map<String, Integer> products;

    public InventoryManagement() {
        this.products = new HashMap<String, Integer>();
    }

    public void addProduct(String name, int quantity) {
        if (products.containsKey(name)) {
            products.put(name, products.get(name) + quantity);
        } else {
            products.put(name, quantity);
        }
    }

    public void editProduct(String name, int quantity) {
        if (products.containsKey(name)) {
            products.put(name, quantity);
        }
    }

    public void deleteProduct(String name) {
        products.remove(name);
    }

    public boolean checkAvailability(String name, int quantity) {
        if (products.containsKey(name)) {
            int availableQuantity = products.get(name);
            return availableQuantity >= quantity;
        } else {
            return false;
        }
    }

    public void displayOutOfStockProducts() {
        for (String name : products.keySet()) {
            if (products.get(name) == 0) {
                System.out.println(name);
            }
        }
    }
}
