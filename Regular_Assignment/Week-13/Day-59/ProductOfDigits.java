import java.util.Scanner;

public class ProductOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int product = 1;
    while (n != 0) {
      int digit = n % 10;
      product *= digit;
      n /= 10;
    }
    System.out.println("Product of digits: " + product);
  }
}