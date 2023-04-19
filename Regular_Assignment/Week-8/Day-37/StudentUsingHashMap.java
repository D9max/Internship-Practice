import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
  int rollno;
  String name;

  Student(int rollno, String name) {
    this.rollno = rollno;
    this.name = name;
  }
}

class StudentUsingHashMap {
  public static void main(String args[]) {
    LinkedHashMap<Integer, Student> map = new LinkedHashMap<Integer, Student>();
    Scanner sc = new Scanner(System.in);
    for (int i = 1; i <= 3; i++) {
      map.put(i, new Student(sc.nextInt(), sc.next()));
    }

    for (Map.Entry m : map.entrySet()) {
      Student st = (Student) m.getValue();
      System.out.println("key is " + m.getKey() + "value is " + m.getValue());
      System.out.println("values are");
      System.out.println(st.rollno + " " + st.name);

    }
  }
}