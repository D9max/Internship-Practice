
//Create a class named "Calculator" with three methods named "add" with first method takes two parameters of int type. Second add method takes 2 paramters of double type and third add method takes 3 parameters of first two parameters of int and third parameters of long and perform addition operation in each method.
import java.util.*;

class Calculator {

  int add(int a, int b) {
    return a + b;
  }

  double add(double a, double b) {
    return a + b;
  }

  long add(int a, int b, long c) {
    return a + b + c;
  }
}

public class CalculatorOverloadMethod {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Calculator c = new Calculator();
    double sum1 = 0, sum2 = 0, sum3 = 0;
    sum1 = sum1 + c.add(10, 20);
    System.out.println("Sum of two integers: " + sum1);
    sum2 = sum2 + c.add(10.5, 20.10);
    System.out.println("Sum of two doubles: " + sum2);
    sum3 = sum3 + c.add(10, 200, 45263);
    System.out.println("Sum of two integers and a long: " + sum3);

    System.out.println("total return output is : " + (sum1 + sum2 + sum3));
  }
}
