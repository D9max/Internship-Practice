import java.util.*;

class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

class Employee extends Person {
  double salary;
  String position;

  Employee(String name, int age, double salary, String position) {
    super(name, age);
    this.salary = salary;
    this.position = position;
  }
}

class Manager extends Employee {
  protected int num_reports;

  Manager(String name, int age, double salary, String position, int num_reports) {
    super(name, age, salary, position);
    this.num_reports = num_reports;
  }

  public void hire_employee() {
    num_reports++;
  }
}

class Engineer extends Employee {
  protected String specialization;

  Engineer(String name, int age, double salary, String position, String specialization) {
    super(name, age, salary, position);
    this.specialization = specialization;
  }

  public void solve_problem() {
    System.out.println("Problem solved!");
  }
}

public class HybridInheritence {
  public static void main(String[] args) {
    Manager manager = new Manager("Mubarak", 26, 90000.0, "Manager", 50);
    Engineer engineer = new Engineer("Mehboob", 35, 70000.0, "Engineer", "Software Development");

    manager.hire_employee();
    engineer.solve_problem();
  }
}

// class Person {
// String name;
// int age;
// }
// class Employee extends Person {
// double sal;

// }
// class Manager extends Employee{
// int num_reports;
// int hire_employee() {
// return num_reports++;
// }
// }
// class Engineer extends Employee{
// String Specialization;
// void solve_problem(){
// System.out.println("Problem Solved");
// }
// }
// public class HybridInheritence {
// public static void main(String args[]) {
// Manager s1= new Manager();
// s1.name = "Alvin";
// s1.age=24;
// s1.sal=56000;
// s1.num_reports=5;
// s1.hire_employee();
// System.out.println(s1.num_reports);
// }
// }