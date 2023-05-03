import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int a = 0, b = 1;
    System.out.print("Fibonacci series up to " + n + " terms: ");
    for (int i = 1; i <= n; i++) {
      System.out.print(a + " ");
      int sum = a + b;
      a = b;
      b = sum;
    }
  }
}