import java.util.HashSet;
import java.util.Set;

public class StringHashSet {
  public static void main(String[] args) {
    Set<String> stringSet = new HashSet<String>();
    stringSet.add("apple");
    stringSet.add("banana");
    stringSet.add("cherry");
    stringSet.add("date");
    stringSet.add("elderberry");

    int count = countStrings(stringSet);
    System.out.println("Number of strings with more than five characters: " + count);
  }

  public static int countStrings(Set<String> stringSet) {
    int count = 0;
    for (String s : stringSet) {
      if (s.length() > 5) {
        count++;
      }
    }
    return count;
  }
}