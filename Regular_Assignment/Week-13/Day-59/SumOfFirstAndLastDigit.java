import java.util.Scanner;

public class SumOfFirstAndLastDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int firstDigit = n;
    while (firstDigit >= 10) {
      firstDigit /= 10;
    }
    int lastDigit = n % 10;
    int sum = firstDigit + lastDigit;
    System.out.println("Sum of first and last digit: " + sum);
  }
}