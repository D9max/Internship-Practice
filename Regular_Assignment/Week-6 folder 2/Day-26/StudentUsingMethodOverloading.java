class Student {
  public void read() {
    System.out.println("name of the book and number of copies is ");
  }

  public void read(String name) {
    System.out.println("the name o fthe book is: " + name);
  }

  public void read(int no_copies) {
    System.out.println("Number of copies is: " + no_copies);
  }
}

public class StudentUsingMethodOverloading {
  public static void main(String args[]) {
    Student student = new Student();
    student.read();
    student.read("java foundation");
    student.read(152);

  }
}