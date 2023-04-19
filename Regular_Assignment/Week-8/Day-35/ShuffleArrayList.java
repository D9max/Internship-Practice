import java.util.ArrayList;
import java.util.Collections;

 class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Before shuffling: " + numbers);
        Collections.shuffle(numbers);
        System.out.println("After shuffling: " + numbers);
    }
}
