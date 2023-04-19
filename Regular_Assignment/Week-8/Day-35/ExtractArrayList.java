import java.util.ArrayList;

 class ExtractArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    System.out.println("Original list: " + numbers);
    ArrayList<Integer> subList = new ArrayList<Integer>(numbers.subList(1, 3));
    System.out.println("Extracted list: " + subList);
  }
}
