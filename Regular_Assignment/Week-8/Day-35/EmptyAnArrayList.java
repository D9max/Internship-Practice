import java.util.*;

class EmptyAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original list: " + list);
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}
