import java.util.ArrayList;
import java.util.Collections;

 class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        System.out.println("Before sorting: " + numbers);
        Collections.sort(numbers);
        System.out.println("After sorting: " + numbers);
          
    }
}
