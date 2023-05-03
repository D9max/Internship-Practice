import java.util.Scanner;

public class ArmstrongNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    System.out.print("Armstrong numbers between 1 to " + n + ": ");
    for (int i = 1; i <= n; i++) {
      int temp = i;
      int sum = 0;
      while (temp != 0) {
        int digit = temp % 10;
        sum += Math.pow(digit, 3);
        temp /= 10;
      }
      if (i == sum) {
        System.out.print(i + " ");
      }
    }
  }
}