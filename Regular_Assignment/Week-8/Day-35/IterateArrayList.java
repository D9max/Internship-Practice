import java.util.ArrayList;

 class IterateArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
