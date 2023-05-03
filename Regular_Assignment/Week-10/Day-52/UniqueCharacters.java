import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    Set<Character> uniqueChars = new HashSet<Character>();
    for (int i = 0; i < input.length(); i++) {
      uniqueChars.add(input.charAt(i));
    }

    System.out.println("Unique characters in the string:");
    for (char c : uniqueChars) {
      System.out.print(c + " ");
    }
  }
}