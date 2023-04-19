import java.util.ArrayList;
import java.util.Scanner;

public class SchoolManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();

        while (true) {
            System.out.println("Welcome to the School Management System!");
            System.out.println("Please choose an action which you want to perform !:");
            System.out.println("1. Add a Teacher");
            System.out.println("2. Add a Student");
            System.out.println("3. Remove a Teacher");
            System.out.println("4. Remove a Student");
            System.out.println("5. Print Teachers");
            System.out.println("6. Print Students");
            System.out.println("7. Find a Teacher");
            System.out.println("8. Find a Student");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Exiting School Management System...");
                    System.exit(0);
                case 1:
                    System.out.println("Enter Teacher's name:");
                    String teacherName = scanner.nextLine();
                    System.out.println("Enter Teacher's subject:");
                    String teacherSubject = scanner.nextLine();
                    Teacher teacher = new Teacher(teacherName, teacherSubject);
                    school.addTeacher(teacher);
                    System.out.println("Teacher added successfully!");
                    break;
                case 2:
                    System.out.println("Enter Student's name:");
                    String studentName = scanner.nextLine();
                    System.out.println("Enter Student's grade level:");
                    int studentGradeLevel = scanner.nextInt();
                    scanner.nextLine();
                    Student student = new Student(studentName, studentGradeLevel);
                    school.addStudent(student);
                    System.out.println("Student added successfully!");
                    break;
                case 3:
                    System.out.println("Enter Teacher's name to remove:");
                    String teacherNameToRemove = scanner.nextLine();
                    school.removeTeacher(teacherNameToRemove);
                    break;
                case 4:
                    System.out.println("Enter Student's name to remove:");
                    String studentNameToRemove = scanner.nextLine();
                    school.removeStudent(studentNameToRemove);
                    break;
                case 5:
                    school.printTeachers();
                    break;
                case 6:
                    school.printStudents();
                    break;
                case 7:
                    System.out.println("Enter Teacher's name to find:");
                    String teacherNameToFind = scanner.nextLine();
                    school.findTeacherByName(teacherNameToFind);
                    break;
                case 8:
                    System.out.println("Enter Student's name to find:");
                    String studentNameToFind = scanner.nextLine();
                    school.findStudentByName(studentNameToFind);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher [name=" + name + ", subject=" + subject + "]";
    }
}

class Student {
    private String name;
    private int gradeLevel;

    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
   
    }
  public int getGradeLevel() {
    return gradeLevel;
}

public void setGradeLevel(int gradeLevel) {
    this.gradeLevel = gradeLevel;
}

@Override
public String toString() {
    return "Student [name=" + name + ", gradeLevel=" + gradeLevel + "]";
}
}
class School {
private ArrayList<Teacher> teachers;
private ArrayList<Student> students;
  public School() {
    teachers = new ArrayList<Teacher>();
    students = new ArrayList<Student>();
}

public void addTeacher(Teacher teacher) {
    teachers.add(teacher);
}

public void removeTeacher(String teacherName) {
    for (Teacher teacher : teachers) {
        if (teacher.getName().equals(teacherName)) {
            teachers.remove(teacher);
            System.out.println("Teacher removed successfully!");
            return;
        }
    }
    System.out.println("Teacher not found!");
}

public void printTeachers() {
    System.out.println("Teachers:");
    for (Teacher teacher : teachers) {
        System.out.println(teacher.toString());
    }
}

public void findTeacherByName(String teacherName) {
    for (Teacher teacher : teachers) {
        if (teacher.getName().equals(teacherName)) {
            System.out.println(teacher.toString());
            return;
        }
    }
    System.out.println("Teacher not found!");
}

public void addStudent(Student student) {
    students.add(student);
}

public void removeStudent(String studentName) {
    for (Student student : students) {
        if (student.getName().equals(studentName)) {
            students.remove(student);
            System.out.println("Student removed successfully!");
            return;
        }
    }
    System.out.println("Student not found!");
}

public void printStudents() {
    System.out.println("Students:");
    for (Student student : students) {
        System.out.println(student.toString());
    }
}

public void findStudentByName(String studentName) {
    for (Student student : students) {
        if (student.getName().equals(studentName)) {
            System.out.println(student.toString());
            return;
        }
    }
    System.out.println("Student not found!");
}
}