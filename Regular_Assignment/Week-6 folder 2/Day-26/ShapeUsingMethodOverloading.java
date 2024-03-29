//create a class named "Shape" with three methods named "area", In first method find the area of the rectangle, second method find the area of the circle and third method find the area of the square.

import java.util.Scanner;

class Shape {
  public void area(int l, int b) {
    System.out.println("Area of Rectangle=" + (l * b));
  }

  public void area(double r) {
    System.out.println("Area of Circle=" + (3.14 * r * r));
  }

  public void area(int s) {
    System.out.println("Area of Square=" + (s * s));
  }
}

public class ShapeUsingMethodOverloading {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Shape s1 = new Shape();
    s1.area(sc.nextInt(), sc.nextInt());
    s1.area(sc.nextDouble());
    s1.area(sc.nextInt());
  }
}