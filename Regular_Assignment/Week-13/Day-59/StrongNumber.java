import java.util.Scanner;

public class StrongNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int temp = n;
    int sum = 0;
    while (temp != 0) {
      int digit = temp % 10;
      int factorial = 1;
      for (int i = 1; i <= digit; i++) {
        factorial *= i;
      }
      sum += factorial;
      temp /= 10;
    }
    if (n == sum) {
      System.out.println(n + " is a Strong number.");
    } else {
      System.out.println(n + " is not a Strong number.");
    }
  }
}