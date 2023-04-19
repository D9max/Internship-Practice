import java.util.ArrayList;

 class ColorList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Colors in the list are: ");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
