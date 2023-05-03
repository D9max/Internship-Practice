//Write a program that creates an ArrayList of integers and allows the user to add and remove integers from the list. The program should also allow the user to print out all the integers in the list in ascending order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IntegerList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter a number to add to the list (or 'quit' to exit):");
            input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
                System.out.println(number + " has been added to the list.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        while (true) {
            System.out.println("Enter a number to remove from the list (or 'quit' to exit):");
            input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                if (numbers.remove(Integer.valueOf(number))) {
                    System.out.println(number + " has been removed from the list.");
                } else {
                    System.out.println(number + " is not in the list.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        Collections.sort(numbers);

        System.out.println("The numbers in the list are:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}