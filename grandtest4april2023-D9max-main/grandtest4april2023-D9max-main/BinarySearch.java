/*Challenge-7: 

Write a program to find a target element in a given array using the binary search technique. The program should then check if the target element is a prime number or not and print an appropriate message. 

Here's a sample input and output for the above question: 

------------------------------------------------------------- 

Sample Input: 

A = [23,45,67,78,86,90] 

Target element is: 67 

Expected Output: 

67 is present in 2nd index position and it is a prime number 

Sample Input: 

A = [23,45,67,78,86,90] 

Target element is: 86 

Expected Output: 

86 is present in 4th index position and it is not a prime number */

import java.util.*;

public class BinarySearch {
  public static void main(String[] args) {
    int[] A = { 23, 45, 67, 78, 86, 90 };
    int target = 67;

    int index = binarySearch(A, target);
    if (index != -1) {
      System.out.print(target + " is present in " + index + "th index position ");
      if (isPrime(target)) {
        System.out.println("and it is a prime number.");
      } else {
        System.out.println("and it is not a prime number.");
      }
    } else {
      System.out.println(target + " is not present in the array.");
    }
  }

  public static int binarySearch(int[] A, int target) {
    int left = 0, right = A.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (A[mid] == target) {
        return mid;
      } else if (A[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
