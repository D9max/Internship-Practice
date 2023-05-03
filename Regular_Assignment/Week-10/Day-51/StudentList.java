import java.util.ArrayList;
import java.util.Scanner;

class Student {

  public String name;
  public double grade;

  public Student(String name, double grade) {
    this.name = name;
    this.grade = grade;
  }
}
  public class StudentList {

    private ArrayList<Student> studentList;

    public StudentList() {
      studentList = new ArrayList<Student>();
    }

    public void addStudent(String name, double grade) {
      Student newStudent = new Student(name, grade);
      studentList.add(newStudent);
      System.out.println("Student added to the list.");
    }

    public void removeStudent(int index) {
      studentList.remove(index);
      System.out.println("Student removed from the list.");
    }

    public void printStudentList() {
      System.out.println("Student list:");
      for (Student student : studentList) {
        System.out.println(student.name + " - " + student.grade);
      }
    }

    public static void main(String[] args) {

      StudentList list = new StudentList();
      Scanner input = new Scanner(System.in);
      String choice;

      do {
        System.out.println("Choose an option:");
        System.out.println("1. Add a student");
        System.out.println("2. Remove a student");
        System.out.println("3. Print student list");
        System.out.println("4. Quit");
        choice = input.nextLine();

        if (choice.equals("1")) {
          System.out.print("Enter student name: ");
          String name = input.nextLine();
          System.out.print("Enter student grade: ");
          double grade = input.nextDouble();
          input.nextLine();
          list.addStudent(name, grade);
        } else if (choice.equals("2")) {
          System.out.print("Enter the index of the student to remove: ");
          int index = input.nextInt();
          input.nextLine();
          list.removeStudent(index);
        } else if (choice.equals("3")) {
          list.printStudentList();
        } else if (!choice.equals("4")) {
          System.out.println("Invalid choice. Please enter 1-4.");
        }

        System.out.println();

      } while (!choice.equals("4"));

      input.close();
    }
  }

