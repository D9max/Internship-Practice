import java.util.Scanner;

public class FrequencyOfDigits {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] frequency = new int;
        while (n != 0) {
            int digit = n % 10;
            frequency[digit]++;
            n /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (frequency[i] != 0) {
                System.out.println("Frequency of " + i + ": " + frequency[i]);
            }
        }
    }
}