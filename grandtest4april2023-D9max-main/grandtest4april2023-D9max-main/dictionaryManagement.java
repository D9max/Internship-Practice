
/*Challenge- 2: 

You have been tasked with creating a dictionary program in Java that stores words and their definitions using a hash map. The program should allow the user to add new words and definitions, view the definitions of existing words. Additionally, the program should handle exceptions when adding a word that already exists in the dictionary or trying to view the definition of a non-existent word.  

Create a console-based menu-driven program that allows the user to perform the following operations: 

1. Add Word and its definition 

2. View Definition 

3. Number of Words 

4. Search Words 

5. Exit 

Depending on the user's choice, prompt the user for the necessary inputs and call the appropriate methods to perform the required action. */
import java.util.HashMap;
import java.util.Scanner;

public class dictionaryManagement {

  public static void main(String[] args) {
    HashMap<String, String> dictionary = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    int choice = 0;
    while (choice != 5) {
      System.out.println("Select an option:");
      System.out.println("1. Add Word and its definition");
      System.out.println("2. View Definition");
      System.out.println("3. Number of Words");
      System.out.println("4. Search Words");
      System.out.println("5. Exit");

      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          addWordAndDefinition(dictionary, scanner);
          break;
        case 2:
          viewDefinition(dictionary, scanner);
          break;
        case 3:
          numberOfWords(dictionary);
          break;
        case 4:
          searchWords(dictionary, scanner);
          break;
        case 5:
          System.out.println("Goodbye!");
          break;
        default:
          System.out.println("Invalid choice. Please select again.");
      }
    }

    scanner.close();
  }

  public static void addWordAndDefinition(HashMap<String, String> dictionary, Scanner scanner) {
    System.out.println("Enter the word:");
    String word = scanner.next();

    if (dictionary.containsKey(word)) {
      System.out.println("The word already exists in the dictionary.");
      return;
    }

    System.out.println("Enter the definition:");
    String definition = scanner.next();

    dictionary.put(word, definition);
    System.out.println("The word and its definition have been added to the dictionary.");
  }

  public static void viewDefinition(HashMap<String, String> dictionary, Scanner scanner) {
    System.out.println("Enter the word:");
    String word = scanner.next();

    if (!dictionary.containsKey(word)) {
      System.out.println("The word is not in the dictionary.");
      return;
    }

    System.out.println("Definition: " + dictionary.get(word));
  }

  public static void numberOfWords(HashMap<String, String> dictionary) {
    System.out.println("The number of words in the dictionary is " + dictionary.size());
  }

  public static void searchWords(HashMap<String, String> dictionary, Scanner scanner) {
    System.out.println("Enter the search term:");
    String searchTerm = scanner.next();

    for (String word : dictionary.keySet()) {
      if (word.contains(searchTerm)) {
        System.out.println(word + ": " + dictionary.get(word));
      }
    }
  }

}
