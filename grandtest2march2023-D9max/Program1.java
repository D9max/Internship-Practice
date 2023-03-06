// Program 1: 

// Sophie, a college student, urgently needs cash to buy her textbooks. She heads to the nearest ATM to withdraw money. The ATM allows withdrawal of denominations 500, 200, and 100. However, Sophie needs a specific amount of money and wants to withdraw it with the minimum number of notes. 

// The ATM will only dispense money if the requested amount is a multiple of 100. 

// If Sophie needs to withdraw Rs. 3700 from the ATM, how many minimum notes of denominations 500, 200, and 100 will she get? Can you write a program to calculate the minimum number of notes required to dispense the requested amount? 

// Input Format 

// 2400 (integer value) 

// Constraints 

// 100<= amount <=10000  

// Entered amount should be positive and only Integers. 

// Output Format 

// 3 (integer value) 

// Sample Input 0: 

// 3700 

// Sample Output 0: 

// 8 

// Sample Input 1: 

// 750 

// Sample Output 1: 

// Entered Amount must be multiples of 100 

import java.util.*;

public class Program1 {
  public static void main(String args[]) {
    int amount, notes500, rem, notes200, notes100;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of notes");
    amount = sc.nextInt();
    notes500 = amount / 500;
    rem = amount % 500;
    notes200 = rem / 200;
    rem %= 200;
    notes100 = rem / 100;
    if (amount % 100 != 0) {
      System.out.println("invalid amount");
    } else {
      System.out.println("number of notes of 500: " + notes500);
      System.out.println("number of notes of 200: " + notes200);
      System.out.println("number of notes of 100: " + notes100);
      System.out.println("total number of notes" + (notes500 + notes200 + notes100));
    }
  }
}
