import java.util.Scanner;

public class SumOfPrimeNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 2; i <= n; i++) {
      boolean isPrime = true;
      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        sum += i;
      }
    }
    System.out.println("Sum of prime numbers between 1 to " + n + " is " + sum);
  }
}