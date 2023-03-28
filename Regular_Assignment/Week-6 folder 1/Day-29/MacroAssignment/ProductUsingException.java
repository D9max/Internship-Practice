import java.util.List;
import java.util.ArrayList;
class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}

class Product {
    private int id;
    private String name;
    private double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }
}

  class Store {
    private List<Product> products;

     Store() {
        products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void removeProduct(int id) throws ProductNotFoundException {
        boolean removed = false;
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                removed = true;
                break;
            }
        }
        if (!removed) {
            throw new ProductNotFoundException("Product with id " + id + " not found in the store");
        }
    }

    void displayProducts() {
        for (Product product : products) {
            System.out.println("Product id: " + product.getId() + ", name: " + product.getName() + ", price: " + product.getPrice());
        }
    }
}

public class ProductUsingException {
    public static void main(String[] args) {
        Store store = new Store();

        Product product1 = new Product(1, "iPhone", 999.99);
        Product product2 = new Product(2, "Samsung Galaxy", 799.99);
        Product product3 = new Product(3, "Google Pixel", 899.99);

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);

        System.out.println("All products in the store:");
        store.displayProducts();

        try {
            store.removeProduct(2);
            System.out.println("\nProduct with id 2 removed from the store");
            System.out.println("Updated list of products in the store:");
            store.displayProducts();

            store.removeProduct(4);
        } catch (ProductNotFoundException e) {
            System.out.println("\n" + e.getMessage());
        }
    }
}
