import java.util.Scanner;

public class PerfectNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    System.out.print("Perfect numbers between 1 to " + n + ": ");
    for (int i = 1; i <= n; i++) {
      int sum = 0;
      for (int j = 1; j < i; j++) {
        if (i % j == 0) {
          sum += j;
        }
      }
      if (i == sum) {
        System.out.print(i + " ");
      }
    }
  }
}