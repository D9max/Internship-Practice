
/*Challenge- 3: 

You have been assigned the task of creating a program that implements a stack using an array in java. 

The program should include error handling to handle any exceptions that may arise during the execution.  

You need to test the program with various inputs and ensure that it works as expected. 

The program should accept the following commands from the user: */
import java.util.Scanner;

public class StackUsingArray {

  private static int top = -1;
  private static int maxSize;
  private static int[] stack;

  StackUsingArray(int maxSize) {
    this.maxSize = maxSize;
    stack = new int[maxSize];
  }

  public void push(int data) {
    if (top == maxSize - 1) {
      System.out.println("Stack overflow");
      return;
    }
    stack[++top] = data;
    System.out.println("Pushed element: " + data);
    display();
  }

  public void pop() {
    if (top == -1) {
      System.out.println("Stack underflow");
      return;
    }
    System.out.println("Popped element: " + stack[top--]);
    display();
  }

  public void peek() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return;
    }
    System.out.println("Top element: " + stack[top]);
  }

  public void display() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return;
    }
    System.out.println("Elements in the stack: ");
    for (int i = top; i >= 0; i--) {
      System.out.println(stack[i]);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the maximum size of the stack: ");
    int maxSize = scanner.nextInt();
    StackUsingArray stack = new StackUsingArray(maxSize);
    while (true) {
      System.out.println("Enter the command (push <value>, pop, peek, display, exit): ");
      String command = scanner.next();
      switch (command) {
        case "push":
          int data = scanner.nextInt();
          stack.push(data);
          break;
        case "pop":
          stack.pop();
          break;
        case "peek":
          stack.peek();
          break;
        case "display":
          stack.display();
          break;
        case "exit":
          scanner.close();
          System.exit(0);
        default:
          System.out.println("Invalid command");
      }
    }
  }
}
