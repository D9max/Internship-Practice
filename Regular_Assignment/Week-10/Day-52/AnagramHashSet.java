import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AnagramHashSet {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a list of words separated by spaces: ");
    String input = scanner.nextLine();

    String[] words = input.split(" ");
    Set<String> anagrams = new HashSet<String>();
    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if (isAnagram(words[i], words[j])) {
          anagrams.add(words[i]);
          anagrams.add(words[j]);
        }
      }
    }

    System.out.println("Anagrams:");
    for (String s : anagrams) {
      System.out.println(s);
    }
  }

  public static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    char[] s1Array = s1.toCharArray();
    char[] s2Array = s2.toCharArray();
    Arrays.sort(s1Array);
    Arrays.sort(s2Array);
    return Arrays.equals(s1Array, s2Array);
  }
}