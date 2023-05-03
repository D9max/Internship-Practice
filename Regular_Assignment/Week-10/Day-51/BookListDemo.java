import java.util.ArrayList;
import java.util.Scanner;

class Book {
  String title;
  String author;
  double price;

  public Book(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  public String toString() {
    return "Title: " + title + ", Author: " + author + ", Price: $" + price;
  }
}

public class BookListDemo {
  public static void main(String[] args) {
    ArrayList<Book> books = new ArrayList<Book>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("1. Add book");
      System.out.println("2. Remove book");
      System.out.println("3. Print all books");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter book title: ");
          String title = scanner.next();
          System.out.print("Enter book author: ");
          String author = scanner.next();
          System.out.print("Enter book price: ");
          double price = scanner.nextDouble();
          books.add(new Book(title, author, price));
          break;
        case 2:
          System.out.print("Enter book title to remove: ");
          String removeTitle = scanner.next();
          for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title.equals(removeTitle)) {
              books.remove(i);
              break;
            }
          }
          break;
        case 3:
          for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
          }
          break;
        case 4:
          System.exit(0);
        default:
          System.out.println("Invalid choice");
      }
    }
  }
}