
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a list of integers separated by spaces: ");
    String input = scanner.nextLine();
    String[] inputArray = input.split(" ");
    List<Integer> integerList = new ArrayList<Integer>();
    for (String s : inputArray) {
      integerList.add(Integer.parseInt(s));
    }
    Set<Integer> integerSet = new HashSet<Integer>(integerList);
    integerList.clear();
    integerList.addAll(integerSet);

    System.out.println("List with duplicates removed:");
    for (int i : integerList) {
      System.out.print(i + " ");
    }
  }
}
