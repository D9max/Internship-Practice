// Program 7: 

// "Brave Author" Slogan Writing Competition was organized for School students at Hyderabad Senior School. Any student who is creative and effective in communicating ideas in short, yet powerful about any instant topic can participate in the competition. The important guideline for the contest is that the Slogan should contain a string where the number of occurrences of any one character in it is equal to the sum of the numbers of occurrences of other characters in the string. 

// Write a program to help the event organizers to determine whether the submitted Slogans adhere to the given condition. 

// Input Format 

// First and only line of input contains one string S consisting of lowercase letters. 

// Constraints 

// 0<= s.length <=20, String must contain only alphabets. 

// Output Format 

// Output a single line containing "Yes"(without quotes) if the string satisfies the condition given above or "No"(without quotes) otherwise. Refer sample input and output for formatting specifications. 

// Sample Input 0 

// acab 

// Sample Output 0 

// YES (explanation: here frequency of one of the character ‘a’ is 2 ,frequency of  the character ‘b’ is 1 and frequency of the character ‘c’ is 1. so frequency of one of the character ‘a’  is equal to the sum of frequencies of other two characters ‘b’ and ‘c’) 

// Sample Input 1 

// abc 

// Sample Output 1 

// NO 

 

 
// Program 8: 

// Given  a string S of length N, an integer M.=2  

// Task 1 : The task is to write a method that encrypts this string using Matrix according to the  below given encryption technique and then prints it.  

  

// Encryption Technique: 

//  The original string is placed in a Matrix of M rows and N/M columns(N/M should be rounded to next integer i.e., 11/2=5.5 which is rounded to 6), such that the first character of the Original text or string is placed on the top-left cell to the bottom-right manner. If the last row is reached, then again go to the top row, and start from the next column. For example: If string is “geeks”, M = 2, then the string will be encrypted in below manner 

 

// Now  traverse the matrix row wise and print the characters as they appear 

// Sample Input1:  

// geeks 

// Sample Output1:  

// ges  ek 
import java.util.*;
class Program7{
  public static void main(String args[]){
    String s;
    char c;
    
    Scanner sc=new Scanner(System.in);
    Sysytem.out.println("enter a String");
    s = sc.nextInt();
    int arr[] freq=new int[26];
    for(int i = 0;i < s.length();i++){
      c = s.charAt(i);
      freq[c - 'a']++;
    }
    boolean found = false;
    for(int i=0;i<26;i++){
      if(freq[i]) == 0) continue;
      int sum = 0;
      for(int j=0;j<26;j++){
      if(i == j) continue;
        sum += freq[j];
    }
      if(freq[j] == sum){
        found = true;
        break;
      }
  }
    if(found){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}