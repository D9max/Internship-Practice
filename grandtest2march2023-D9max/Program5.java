// Program 5: 

// As a security analyst, you need to send a confidential message to your colleague without anyone being able to intercept it. You remember a simple way to encrypt a message by rearranging its characters. You decide to write a program to quickly encrypt your message. 

// The program takes the string you entered and applies the encryption method of selecting even-indexed characters first, followed by odd-indexed characters. The encrypted string is displayed on the screen. 

// Write a program that asks the user for a string and uses this method to encrypt the string 

// Input format: 

// The program prompts the user to enter a message to encrypt. The input should be a string containing a message to encrypt. 

// Output format: 

// The program outputs the encrypted message by selecting even-indexed characters first, followed by odd-indexed characters. The output is a string containing the encrypted message. 

// Sample Input1: 

// message 

// Sample Output1: 

// msaeesg 

// Sample Input2 

// Meet me tonight at the park 

// Sample Output2: 

// Me etngta h aketm oih ttepr 

import java.util.*;
public class Program5{
  public static void main(String args[]){
    String encrypted;
    Scanner sc = new Scanner(System.in);
   System.out.println("enter a String");
    String s=sc.nextLine();
     String evencharacters = "";
    String oddcharacters = "";
    for(int i=0;i<s.length();i++){
      if(i%2==0){
       char ch=s.charAt(i);
        evencharacters+=ch;
      }else{
      char ch=s.charAt(i);
        oddcharacters+=ch;

      }
    }
    String r=evencharacters+oddcharacters;
    System.out.println("Rearrangeed Strings are "+r);
  }
}