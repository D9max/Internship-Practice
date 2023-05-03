
/*Write a program that creates an ArrayList of names (Strings) and allows the user to add and remove names from the list. The program should also allow the user to print out all the names in the list.*/
import java.util.ArrayList;
import java.util.Scanner;

public class NameList {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    String input;

    while (true) {
      System.out.println("Enter a name to add to the list (or 'quit' to exit):");
      input = scanner.nextLine();

      if (input.equals("quit")) {
        break;
      }

      names.add(input);
      System.out.println(input + " has been added to the list.");
    }

    while (true) {
      System.out.println("Enter a name to remove from the list (or 'quit' to exit):");
      input = scanner.nextLine();

      if (input.equals("quit")) {
        break;
      }

      if (names.remove(input)) {
        System.out.println(input + " has been removed from the list.");
      } else {
        System.out.println(input + " is not in the list.");
      }
    }

    System.out.println("The names in the list are:");
    for (String name : names) {
      System.out.println(name);
    }
  }
}