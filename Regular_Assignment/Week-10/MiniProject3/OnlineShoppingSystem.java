
/*Create a mini project in Java that models a simple online shopping system. The system should allow users to view products, add them to a shopping cart, and check out. The project should utilize inheritance, interfaces, overriding, collections, and custom exceptions.
 
Here are the basic requirements:
 
Create an interface called "Product" that defines the basic properties of a product such as the name, description, price, and quantity.
Create two classes that implement the "Product" interface: "ElectronicProduct" and "ClothingProduct". "ElectronicProduct" should have additional properties such as brand and warranty while "ClothingProduct" should have additional properties such as size and color.
Create a class called "ShoppingCart" that stores the products selected by the user.
Create a class called "Checkout" that handles the payment and shipping of the products in the shopping cart.
Use custom exceptions to handle cases such as insufficient stock or invalid payment information,shipping information
Implement additional features such as search,*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Product {
  String getName();

  String getDescription();

  double getPrice();

  int getQuantity();
}

class ElectronicProduct implements Product {
  private String name;
  private String description;
  private double price;
  private int quantity;
  private String brand;
  private String warranty;

  public ElectronicProduct(String name, String description, double price, int quantity, String brand, String warranty) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
    this.brand = brand;
    this.warranty = warranty;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getBrand() {
    return brand;
  }

  public String getWarranty() {
    return warranty;
  }
}

class ClothingProduct implements Product {
  private String name;
  private String description;
  private double price;
  private int quantity;
  private String size;
  private String color;

  public ClothingProduct(String name, String description, double price, int quantity, String size, String color) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
    this.size = size;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getSize() {
    return size;
  }

  public String getColor() {
    return color;
  }
}

class ShoppingCart {
  private List<Product> products;

  public ShoppingCart() {
    products = new ArrayList<Product>();
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public void removeProduct(Product product) {
    products.remove(product);
  }

  public void removeProductFromCart(String removeProductName) {
    for (Product p : products) {
      if (p.getName().equals(removeProductName)) {
        products.remove(p);
        System.out.println(removeProductName + " removed from cart.");
        return;
      }
    }
    System.out.println("Product not found in cart.");
  }

  public List<Product> getProducts() {
    return products;
  }
}

class InsufficientStockException extends Exception {
  public InsufficientStockException(String message) {
    super(message);
  }
}

class InvalidPaymentException extends Exception {
  public InvalidPaymentException(String message) {
    super(message);
  }
}

class Checkout {
  private ShoppingCart cart;

  public Checkout(ShoppingCart cart) {
    this.cart = cart;
  }

  public double calculateTotal() {
    double total = 0;
    for (Product product : cart.getProducts()) {
      total += product.getPrice() * product.getQuantity();
    }
    return total;
  }

  public void processPayment(String payment) throws InvalidPaymentException {
    if (payment == null) {
      throw new InvalidPaymentException("Invalid payment");
    }
  }

  public void processShipping() throws InsufficientStockException {
    for (Product product : cart.getProducts()) {
      if (product.getQuantity() <= 0) {
        throw new InsufficientStockException("Insufficient stock for " + product.getName());
      }
    }
  }
}

public class OnlineShoppingSystem {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    ElectronicProduct pc = new ElectronicProduct("MacBook", "best one", 130000, 2, "Apple", "1 year");
    ClothingProduct shirt = new ClothingProduct("shirt", "nice", 500, 5, "XL", "Red");
    cart.addProduct(pc);
    cart.addProduct(shirt);
    Checkout checkout = new Checkout(cart);
    try {
      checkout.processShipping();
      checkout.processPayment("1213-4526-5543-5355");
      double total = checkout.calculateTotal();
      System.out.println("Total: " + total);
    } catch (InsufficientStockException e) {
      System.out.println(e.getMessage());
    } catch (InvalidPaymentException e) {
      System.out.println(e.getMessage());
    }

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter product name to search in the cart:");
    String productName = scanner.nextLine();
    boolean found = false;
    for (Product product : cart.getProducts()) {
      if (product.getName().equals(productName)) {
        found = true;
        System.out.println("Product found in cart:");
        System.out.println("Name: " + product.getName());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        if (product instanceof ElectronicProduct) {
          ElectronicProduct electronicProduct = (ElectronicProduct) product;
          System.out.println("Brand: " + electronicProduct.getBrand());
          System.out.println("Warranty: " + electronicProduct.getWarranty());
        } else if (product instanceof ClothingProduct) {
          ClothingProduct clothingProduct = (ClothingProduct) product;
          System.out.println("Size: " + clothingProduct.getSize());
          System.out.println("Color: " + clothingProduct.getColor());
        }
      }
    }
    if (!found) {
      System.out.println("Product not found in cart.");
    }

    System.out.println("Enter product details to add to cart:");
    System.out.println("Enter product type (ElectronicProduct/ClothingProduct):");
    String productType = scanner.nextLine();
    System.out.println("Enter product name:");
    String name = scanner.nextLine();
    System.out.println("Enter product description:");
    String description = scanner.nextLine();
    System.out.println("Enter product price:");
    double price = scanner.nextDouble();
    System.out.println("Enter product quantity:");
    int quantity = scanner.nextInt();
    if (productType.equals("ElectronicProduct")) {
      System.out.println("Enter product brand:");
      String brand = scanner.nextLine();
      System.out.println("Enter product warranty:");
      String warranty = scanner.nextLine();
      ElectronicProduct electronicProduct = new ElectronicProduct(name, description, price, quantity, brand, warranty);
      cart.addProduct(electronicProduct);
    } else if (productType.equals("ClothingProduct")) {
      System.out.println("Enter product size:");
      String size = scanner.nextLine();
      System.out.println("Enter product color:");
      String color = scanner.nextLine();
      ClothingProduct clothingProduct = new ClothingProduct(name, description, price, quantity, size, color);
      cart.addProduct(clothingProduct);
    } else {
      System.out.println("Invalid product type.");
    }
    System.out.println("Enter product name to remove from cart:");
    String removeProductName = scanner.nextLine();
    cart.removeProduct(removeProductName);
    System.out.println("Cart after removal:");
    for (Product product : cart.getProducts()) {
      System.out.println(product.getName() + " - " + product.getQuantity());
    }
  }
}
