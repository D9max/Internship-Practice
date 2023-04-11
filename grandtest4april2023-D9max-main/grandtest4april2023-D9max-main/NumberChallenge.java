/*Challenge-5: 

Mike was enthusiastic to attend the "Kracker Jack Fun Fair 2023" and couldn't wait to participate in the Number Challenge. Being a math expert, he was given a string D of numbers that only contained 0's and 1's. The challenge was to change exactly one digit from the given string to make all the digits in the string the same. If it was possible to make all the digits equal by flipping only one digit, he had to output "Yes". If it was not possible, he had to output "No". Can you write a program to help Mike win the challenge? 

Input Format: 

The first and only input contains a string D consisting of only 0's and 1's. 

Output Format: 

Output "Yes" if it is possible to make all digits in the string the same by flipping exactly one digit. Otherwise, output "No". 

Refer to the sample input and output for formatting specifications. 

Sample Input 1: 

101 

Sample Output 1: 

Yes 

Sample Input 2: 

11 

Sample Output 2: 

No 
*/
import java.util.*;

public class NumberChallenge {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int numofzeros = 0;
    int numofOnce = 0;
    for (int i = 0; i < n.length(); i++) {
      if (n.charAt(i) == '0') {
        numofzeros++;
      } else {
        numofOnce++;
      }
    }
    if (numofzeros == 1 || numofOnce == 1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
