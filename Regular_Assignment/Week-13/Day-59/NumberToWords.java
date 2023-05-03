import java.util.Scanner;

public class NumberToWords {
  private static final String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
      "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
  private static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
      "ninety" };

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    if (n < 0 || n > 9999) {
      System.out.println("Invalid number");
    } else if (n == 0) {
      System.out.println("zero");
    } else {
      String words = "";
      if (n / 1000 > 0) {
        words += ones[n / 1000] + " thousand ";
        n %= 1000;
      }
      if (n / 100 > 0) {
        words += ones[n / 100] + " hundred ";
        n %= 100;
      }
      if (n > 0) {
        if (n < 20) {
          words += ones[n];
        } else {
          words += tens[n / 10] + " " + ones[n % 10];
        }
      }
      System.out.println(words);
    }
  }
}