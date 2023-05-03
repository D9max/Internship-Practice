import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int temp = n;
    int sum = 0;
    while (temp != 0) {
      int digit = temp % 10;
      sum += Math.pow(digit, 3);
      temp /= 10;
    }
    if (n == sum) {
      System.out.println(n + " is an Armstrong number.");
    } else {
      System.out.println(n + " is not an Armstrong number.");
    }
  }
}