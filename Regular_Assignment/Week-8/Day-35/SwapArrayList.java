import java.util.*;

 class SwapArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println("Original list: " + list);

    int temp = list.get(1);
    list.set(1, list.get(3));
    list.set(3, temp);

    System.out.println("List after swapping: " + list);
  }
}
