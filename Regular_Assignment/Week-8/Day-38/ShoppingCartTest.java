import java.util.*;

class ShoppingCart {
  private List<Item> items;

  ShoppingCart() {
    items = new ArrayList<>();
  }

  void addItem(Item item) {
    items.add(item);
  }

  void removeItem(Item item) {
    items.remove(item);
  }

  void displayItems() {
    for (Item item : items) {
      System.out.println(item.getName() + "-$" + item.getPrice());
    }
  }

  double getTotalCost() {
    double total = 0.0;
    for (Item item : items) {
      total += item.getPrice();
    }
    return total;
  }
}

class Item {
  private String name;
  private double price;

  Item(String name, double price) {
    this.name = name;
    this.price = price;
  }

  String getName() {
    return name;
  }

  double getPrice() {
    return price;
  }
}

public class ShoppingCartTest {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    Item item1 = new Item("shirt", 30.0);
    Item item2 = new Item("Lowers", 40.0);
    Item item3 = new Item("Shoes", 50.0);

    cart.addItem(item1);
    cart.addItem(item2);
    cart.addItem(item3);
    System.out.println("Items in cart:");
    cart.displayItems();
    double totalCost = cart.getTotalCost();
    System.out.printf("Total cost: $%.2f\n", totalCost);
    cart.removeItem(item2);
    System.out.println("Updated items in cart:");
    cart.displayItems();
    totalCost = cart.getTotalCost();
    System.out.printf("Updated total cost: $%.2f\n", totalCost);
  }
}