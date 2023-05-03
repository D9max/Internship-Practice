/*Create an interface called Calculator with the following method signatures:
int add(int a, int b)int subtract(int a, int b)int multiply(int a, int b)int divide(int a, int b)
Create a class called BasicCalculator that implements the Calculator interface. Implement the methods according to their respective arithmetic operations.
Write a Main class that creates an instance of BasicCalculator and calls its methods to perform some arithmetic operations. Print out the results of each operation.*/

interface Calculator {
  int add(int a, int b);

  int subtract(int a, int b);

  int multiply(int a, int b);

  int divide(int a, int b);
}

class BasicCalculator implements Calculator {
  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    return a / b;
  }
}

public class CalculatorUsingInterface {
  public static void main(String[] args) {
    BasicCalculator calculator = new BasicCalculator();

    int a = 10, b = 5;
    System.out.println("a + b = " + calculator.add(a, b));
    System.out.println("a - b = " + calculator.subtract(a, b));
    System.out.println("a * b = " + calculator.multiply(a, b));
    System.out.println("a / b = " + calculator.divide(a, b));
  }
}