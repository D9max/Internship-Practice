//Create an abstract class "Person" with a non-abstract method "getFullName()". Implement two subclasses "Student" and "Teacher" which implement the "getFullName()" method and also have their own attributes such as "studentId" and "teacherId".

abstract Person{
  String Firstname;
  String Lastname;

  public Person(String Firstname,String Lastname);
  this.Firstname=Firstname;
  this.Lastname=Lastname;
}
void getFullName(){
return this.firstName + " " + this.lastName;
  
}
}
class Student extends Person{
 private int studentId;

    public Student(String firstName, String lastName, int studentId) {
        super(firstName, lastName);
        this.studentId = studentId; 
}
   public int getStudentId() {
        return this.studentId;
    }
}
class Teacher extends Person{
  private int teacherId;

    public Teacher(String firstName, String lastName, int teacherId) {
        super(firstName, lastName);
        this.teacherId = teacherId;
}
  
    public int getTeacherId() {
        return this.teacherId;
    }
}
public class PersonUsingAbstractMethod {
    public static void main(String[] args) {
        Person student = new Student("mubarak", "m", 25);
        System.out.println(student.getFullName());
        System.out.println(student.getStudentId());

        Person teacher = new Teacher("lalitha", "ujjaneni", 56);
        System.out.println(teacher.getFullName());
        System.out.println(teacher.getTeacherId());
    }
}