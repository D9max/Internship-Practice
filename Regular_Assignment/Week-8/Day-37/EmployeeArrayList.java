import java.util.*;

class Employee {
  String ename, address, position;
  double eid, sal;

  Employee(String ename, String address, String position, double sal, double eid) {
    this.ename = ename;
    this.address = address;
    this.position = position;
    this.eid = eid;
    this.sal = sal;
  }
}

class EmployeeArrayList {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Employee> e = new ArrayList<Employee>();
    System.out.println("Enter details of 3 employees:");
    for (int i = 0; i < 3; i++) {
      e.add(new Employee(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble()));
    }
    for (Employee emp : e) {
      System.out.println("name: " + emp.ename + ", address: " + emp.address + ", position: " + emp.position
          + ", emp id: " + emp.eid + ", emp sal: " + emp.sal);
    }
  }
}
