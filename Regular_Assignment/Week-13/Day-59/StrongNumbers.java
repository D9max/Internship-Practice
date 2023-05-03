import java.util.Scanner;

public class StrongNumbers {
  public static void ontinue
  from the
  previous answer:

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    System.out.print("Strong numbers between 1 to " + n + ": ");
    for (int i = 1; i <= n; i++) {
      int temp = i;
      int sum = 0;
      while (temp != 0) {
        int digit = temp % 10;
        int factorial = 1;
        for (int j = 1; j <= digit; j++) {
          factorial *= j;
        }
        sum += factorial;
        temp /= 10;
      }
      if (i == sum) {
        System.out.print(i + " ");
      }
    }
  }
}
