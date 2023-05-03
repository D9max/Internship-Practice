import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int temp = n;
    int reverse = 0;
    while (temp != 0) {
      int digit = temp % 10;
      reverse = reverse * 10 + digit;
      temp /= 10;
    }
    if (n == reverse) {
      System.out.println(n + " is a palindrome number.");
    } else {
      System.out.println(n + " is not a palindrome number.");
    }
  }
}
