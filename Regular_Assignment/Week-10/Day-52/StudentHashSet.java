import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Student {
  public String name;
  public double grade;

  public Student(String name, double grade) {
    this.name = name;
    this.grade = grade;
  }

  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Student)) {
      return false;
    }
    Student other = (Student) obj;
    return name.equals(other.name) && grade == other.grade;
  }

  public int hashCode() {
    return name.hashCode() ^ Double.hashCode(grade);
  }
}

public class StudentHashSet {
  public static void main(String[] args) {
    Set<Student> studentSet = new HashSet<Student>();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("1. Add student");
      System.out.println("2. Remove student");
      System.out.println("3. Print all students by grade (highest to lowest)");
      System.out.println("4. Quit");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      if (choice == 1) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine();
        studentSet.add(new Student(name, grade));
      } else if (choice == 2) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        Student studentToRemove = null;
        for (Student s : studentSet) {
          if (s.name.equals(name)) {
            studentToRemove = s;
            break;
          }
        }
        if (studentToRemove != null) {
          studentSet.remove(studentToRemove);
          System.out.println("Student removed.");
        } else {
          System.out.println("Student not found.");
        }
      } else if (choice == 3) {
        Set<Student> sortedStudentSet = new TreeSet<Student>(new Comparator<Student>() {
          public int compare(Student s1, Student s2) {
            if (s1.grade > s2.grade) {
              return -1;
            } else if (s1.grade < s2.grade) {
              return 1;
            } else {
              return 0;
            }
          }
        });
        sortedStudentSet.addAll(studentSet);
        System.out.println("All students sorted by grade (highest to lowest):");
        for (Student s : sortedStudentSet) {
          System.out.println(s.name + " (" + s.grade + ")");
        }
      } else if (choice == 4) {
        break;
      } else {
        System.out.println("Invalid choice.");
      }
    }
  }
}
