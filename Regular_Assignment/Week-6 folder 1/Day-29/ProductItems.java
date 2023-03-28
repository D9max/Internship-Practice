import java.util.*;

class Product {
  private String name;
  private Double price;
  private int quantity;

  public Product(String name, Double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }
}

class PointOfSale {
  private List<Product> products;

  public PointOfSale() {
    products = new ArrayList<>();
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public void removeProduct(Product product) {
    products.remove(product);
  }

  public Double getTotalCost() {
    Double total = 0.0;
    for (Product product : products) {
      total += product.getPrice() * product.getQuantity();
    }
    return total;
  }
}

public class ProductItems {
  public static void main(String[] args) {
    PointOfSale pointOfSale = new PointOfSale();

    Product product1 = new Product("xyz", 400.0, 2);
    System.out.println("product name :" + product1.getName() + "\n" + "Product Price :" + product1.getPrice() + "\n"
        + "Product Quantity :" + product1.getQuantity());
    pointOfSale.addProduct(product1);
    System.out.println("Add product after Total cost is: " + pointOfSale.getTotalCost());
    pointOfSale.removeProduct(product1);
    System.out.println("Remove product after Total cost is: " + pointOfSale.getTotalCost());

  }
}
