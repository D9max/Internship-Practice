import java.util.ArrayList;

public class CopyArrayList {
  public static void main(String[] args) {
    ArrayList<String> list1 = new ArrayList<String>();
    list1.add("apple");
    list1.add("banana");
    list1.add("cherry");
    ArrayList<String> list2 = new ArrayList<String>(list1);
    System.out.println("List1: " + list1);
    System.out.println("List2: " + list2);
  }
}
