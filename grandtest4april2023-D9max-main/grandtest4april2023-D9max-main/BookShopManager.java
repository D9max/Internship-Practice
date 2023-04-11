/*Challenge- 1: 

As a manager of a book shop, you are responsible for managing all the operations related to books in the shop. You have a system that stores all the book details(book_id, title, author, price) in an ArrayList of Book objects. 

Your task is to create a Java program that helps you manage the book shop efficiently.  

Create a console-based menu-driven program that allows the user to perform the following operations: 

1. Add books 

2. Calculate total price of all books 

3. Remove a book by book_id 

4. Update book price by book_id 

5. Search books by author 

6. Quit the program 

If no books are found for the given author name, the method should throw a custom exception called BookNotFoundException with an appropriate error message. 

Each menu option should call the corresponding method and display the results or appropriate error messages.*/

import java.util.ArrayList;
import java.util.Scanner;

public class BookShopManager {

  private static ArrayList<Book> bookList = new ArrayList<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;

    do {
      System.out.println("\nBook Shop Management System");
      System.out.println("---------------------------");
      System.out.println("1. Add Books");
      System.out.println("2. Calculate Total Price of all Books");
      System.out.println("3. Remove Book by Book ID");
      System.out.println("4. Update Book Price by Book ID");
      System.out.println("5. Search Books by Author");
      System.out.println("6. Quit");

      System.out.print("\nEnter your choice (1-6): ");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          addBooks();
          break;
        case 2:
          calculateTotalPrice();
          break;
        case 3:
          removeBookByID();
          break;
        case 4:
          updateBookPriceByID();
          break;
        case 5:
          searchBooksByAuthor();
          break;
        case 6:
          System.out.println("\nThank you for using Book Shop Management System!");
          break;
        default:
          System.out.println("\nInvalid choice. Please enter a valid choice.");
          break;
      }
    } while (choice != 6);
  }

  private static void addBooks() {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter the number of books you want to add: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("\nBook " + i + " details:");
      System.out.print("Enter Book ID: ");
      int bookID = sc.nextInt();
      sc.nextLine();
      System.out.print("Enter Book Title: ");
      String bookTitle = sc.nextLine();
      System.out.print("Enter Book Author: ");
      String bookAuthor = sc.nextLine();
      System.out.print("Enter Book Price: ");
      double bookPrice = sc.nextDouble();

      Book book = new Book(bookID, bookTitle, bookAuthor, bookPrice);
      bookList.add(book);
    }

    System.out.println("\nBooks added successfully!");
  }

  private static void calculateTotalPrice() {
    double totalPrice = 0.0;

    for (Book book : bookList) {
      totalPrice += book.getPrice();
    }

    System.out.println("\nTotal Price of all Books: $" + totalPrice);
  }

  private static void removeBookByID() {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter Book ID to remove: ");
    int bookID = sc.nextInt();

    boolean removed = false;
    for (Book book : bookList) {
      if (book.getBookID() == bookID) {
        bookList.remove(book);
        removed = true;
        break;
      }
    }

    if (removed) {
      System.out.println("\nBook with Book ID " + bookID + " removed successfully!");
    } else {
      System.out.println("\nBook with Book ID " + bookID + " not found!");
    }
  }

  private static void updateBookPriceByID() {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter Book ID to update price: ");
    int bookID = sc.nextInt();

    boolean updated = false;
    for (Book book : bookList) {
      if (book.getBookID() == bookID) {
        System.out.print("Enter new Book Price: ");
        double newPrice = sc.nextDouble();
        book.setPrice(newPrice);
        updated = true;
        break;
      }
    }
    if (updated) {
      System.out.println("\nBook price with Book ID " + bookID + " updated successfully!");
    } else {
      System.out.println("\nBook with Book ID " + bookID + " not found!");
    }
  }

  private static void searchBooksByAuthor() {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter author name to search: ");
    String authorName = sc.nextLine();

    ArrayList<Book> matchedBooks = new ArrayList<>();
    for (Book book : bookList) {
      if (book.getAuthor().equalsIgnoreCase(authorName)) {
        matchedBooks.add(book);
      }
    }

    if (!matchedBooks.isEmpty()) {
      System.out.println("\nBooks by author " + authorName + ":");
      for (Book book : matchedBooks) {
        System.out.println(book.toString());
      }
    } else {
      System.out.println("\nNo books found by author " + authorName);
    }
  }
}
