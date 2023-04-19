import java.util.ArrayList;
import java.util.Collections;

 class ReverseArrayList {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");
    System.out.println("Before reversing: " + names);
    Collections.reverse(names);
    System.out.println("After reversing: " + names);
  }
}
