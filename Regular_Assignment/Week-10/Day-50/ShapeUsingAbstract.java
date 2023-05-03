abstract class shape {
  abstract double area();

  abstract double perimeter();
}

class Rectangle extends shape {
  double length, width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double area() {
    return length * width;
  }

  double perimeter() {
    return 2 * (length * width);
  }
}
  class Square extends shape {
    double side;

    Square(double side) {
      this.side = side;
    }

    double area() {
      return side * side;
    }

    double perimeter() {
      return 2 * side;
    }
  }
    public class ShapeUsingAbstract {
      public static void main(String args[]) {
        Rectangle r = new Rectangle(6, 4);
        System.out.println("Area of rectangle: " + r.area());

        Square s = new Square(8);
        System.out.println("Perimeter of square: " + s.perimeter());
      }
    }
