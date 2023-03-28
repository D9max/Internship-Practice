//Write a program that demonstrates method overriding. Define a superclass called Shape with a method called getArea() that returns 0. Define two subclasses, Circle and Rectangle, that extend Shape and override the getArea() method to calculate and return the area of their respective shapes. In the main method, create instances of both Circle and Rectangle and call their getArea() methods.

class Shape {
  public double getArea() {
    return 0;
  }
}

class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }
}

class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getArea() {
    return width * height;
  }
}

public class ShapeUsingMethodOverriding {
  public static void main(String[] args) {
    Circle circle = new Circle(6);
    System.out.println(circle.getArea());

    Rectangle rectangle = new Rectangle(2, 4);
    System.out.println(rectangle.getArea());
  }
}
