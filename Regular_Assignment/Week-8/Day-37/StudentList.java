import java.util.*;

class Student {
  int rollnum, sem;
  String name, place;

  Student(String name, String place, int rollnum, int sem) {
    this.name = name;
    this.place = place;
    this.rollnum = rollnum;
    this.sem = sem;
  }
}

public class StudentList {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter details of 5 students:");
    ArrayList<Student> s = new ArrayList<Student>();
    for (int i = 0; i < 5; i++) {
      s.add(new Student(sc.next(), sc.next(), sc.nextInt(), sc.nextInt()));
    }

    for (Student stu : s) {
      System.out.println(
          "Name: " + stu.name + ", Place: " + stu.place + ", Roll Number: " + stu.rollnum + ", Semester: " + stu.sem);
    }
  }
}
