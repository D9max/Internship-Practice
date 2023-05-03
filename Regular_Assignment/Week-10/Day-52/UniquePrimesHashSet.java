import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniquePrimesHashSet {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a list of integers separated by spaces: ");
    String input = scanner.nextLine();

    String[] inputArray = input.split(" ");
    Set<Integer> integerSet = new HashSet<Integer>();
    Set<Integer> primeSet = new HashSet<Integer>();
    for (String s : inputArray) {
      int n = Integer.parseInt(s);
      if (isPrime(n)) {
        primeSet.add(n);
      }
      integerSet.add(n);
    }

    System.out.println("Number of unique prime numbers: " + primeSet.size());
  }

  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}