// Program 4: 

// Once upon a time, there was a language learner who wanted to improve their vocabulary and creativity. They decided to create a program that would allow them to practice filling in the blanks of a story with different adjectives, nouns, and other words. 

// The language learner first came up with a story that had some missing words. The story went like this:  

// "[noun] was really [adjective] today. We learned how to write [activity] today. I can't wait for tomorrow!" 

// Now your task is to create a program that would prompt the user to enter different types of words such as a noun, an adjective, and an activity. Once the user entered the words, the program would insert them into the story and print out the full story with the inserted words. 

// For example, if the user entered "Java class" for the class name, "HAPPY" for the adjective, and "programs" for the activity. The program then printed out the story with the inserted words like this: 

//  "Class was really Happy today. We learned how to write programs today. I can't wait for tomorrow!" 

// Input Format: 

// The program prompts the user to enter three pieces of information, each on a separate line: 

// A noun (a string). 

// An adjective (a string). 

// An activity (a string). 

// The program expects the user to enter each piece of information on a new line. 

// Output Format: 

// After the user has entered the three pieces of information, the program inserts them into the following story template: 

// [noun] was really [adjective] today. We learned how to write [activity] today. I can't wait for tomorrow! 

// Sample Input 1: 

// class 

// Happy 

// programs 

// Sample Output1: 

// java class was really Happy today. We learned how to write java programs today. I can't wait for tomorrow! 

// Sample Input 2: 

// bitLabs 

// exciting 

// code 

// Sample Output 2: 

// bitLabs was really exciting today. We learned how to write java code today in class. I can't wait for tomorrow! 

import java.util.*;

public class Program4 {
  public static void main(String args[]) {
    String noun, adj, act;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a noun ");
    noun = sc.next();
    System.out.println("enter a adjuctive");
    adj = sc.next();
    System.out.println("enter a activity");
    act = sc.next();
    String story = noun + "\twas really " + adj + " "+"today. We learned how to write\t" + act
        + " "+"today in class. I can't wait for tomorrow!";
    System.out.println(story);
  }
}