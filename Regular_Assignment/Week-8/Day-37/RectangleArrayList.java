import java.util.ArrayList;

 class Rectangle {
    private int length;
    private int width;

     Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

     int getLength() {
        return length;
    }

     int getWidth() {
        return width;
    }

     int getArea() {
        return length * width;
    }
}

public class RectangleArrayList {
    public static void main(String[] args) {

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(5, 3));
        rectangles.add(new Rectangle(7, 2));
        rectangles.add(new Rectangle(4, 6));
        rectangles.add(new Rectangle(8, 1));

        for (Rectangle rectangle : rectangles) {
            System.out.println("Length: " + rectangle.getLength());
            System.out.println("Width: " + rectangle.getWidth());
            System.out.println("Area: " + rectangle.getArea());
            System.out.println();
        }
    }
}
