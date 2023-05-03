/*Write a Java program to demonstrate function overloading. Create a class named "MathFunctions" with three methods named "max", "max", and "max". The "max" method with two integer parameters will return the maximum value between the two parameters. The "max" method with two double parameters will return the maximum value between the two parameters. The "max" method with three integer parameters will return the maximum value between the three parameters. In the main method, create an object of the "MathFunctions" class and call each of the "max" methods with appropriate arguments.*/
class MathFunctions {
  int max(int a, int b) {
    return (a > b) ? a : b;
  }

  double max(double a, double b) {
    return (a > b) ? a : b;
  }

  int max(int a, int b, int c) {
    return max(max(a, b), c);
  }
}

public class MatchFunctionUsingMethodOvverloading {
  public static void main(String[] args) {
    MathFunctions math = new MathFunctions();

    int a = 5, b = 10, c = 15;
    double x = 2.5, y = 3.5;

    System.out.println("Max of " + a + " and " + b + ": " + math.max(a, b));
    System.out.println("Max of " + x + " and " + y + ": " + math.max(x, y));
    System.out.println("Max of " + a + ", " + b + ", and " + c + ": " + math.max(a, b, c));
  }
}