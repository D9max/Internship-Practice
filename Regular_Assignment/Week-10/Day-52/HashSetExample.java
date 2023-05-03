import java.util.HashSet;

public class HashSetExample {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<Integer>();
    set.add(5);
    set.add(10);
    set.add(15);
    set.add(20);
    set.add(25);

    System.out.println("Elements in the HashSet:");
    for (int i : set) {
      System.out.println(i);
    }
  }
}