import java.util.Scanner;

public class PowerOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int base = sc.nextInt();
    System.out.print("Enter the power: ");
    int exponent = sc.nextInt();
    int result = 1;
    for (int i = 1; i <= exponent; i++) {
      result *= base;
    }
    System.out.println(base + " raised to the power of " + exponent + " is " + result);
  }
}