// Create an interface Employee with the following methods:public void calculateSalary();
// public void displayEmployeeDetails();
// Create classes Manager, Developer, and Tester that implement this interface. Write a program that accepts the type of employee and their details (name, age, designation, salary) and calculates their salary based on their designation. Display the employee details and the calculated salary.

import java.util.Scanner;

interface Employee {
  public void calculateSalary();

  public void displayEmployeeDetails();
}

class Manager implements Employee {
  String name;
  int age;
  String designation;
  double salary;

  public void calculateSalary() {
    salary = salary + (salary * 0.1);
  }

  public void displayEmployeeDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Designation: " + designation);
    System.out.println("Salary: " + salary);
  }
}

class Developer implements Employee {
  String name;
  int age;
  String designation;
  double salary;

  public void calculateSalary() {
    salary = salary + (salary * 0.2);
  }

  public void displayEmployeeDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Designation: " + designation);
    System.out.println("Salary: " + salary);
  }
}

class Tester implements Employee {
  String name;
  int age;
  String designation;
  double salary;

  public void calculateSalary() {
    salary = salary + (salary * 0.3);
  }

  public void displayEmployeeDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Designation: " + designation);
    System.out.println("Salary: " + salary);
  }
}

class EmployeeDetails {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the type of employee: ");
    String type = sc.next();
    if (type.equals("Manager")) {
      Manager m = new Manager();
      System.out.println("Enter the name: ");
      m.name = sc.next();
      System.out.println("Enter the age: ");
      m.age = sc.nextInt();
      System.out.println("Enter the designation: ");
      m.designation = sc.next();
      System.out.println("Enter the salary: ");
      m.salary = sc.nextDouble();
      m.calculateSalary();
      m.displayEmployeeDetails();
    } 
    else if (type.equals("Developer")) {
      Developer d = new Developer();
      System.out.println("Enter the name: ");
      d.name = sc.next();
      System.out.println("Enter the age: ");
      d.age = sc.nextInt();
      System.out.println("Enter the designation: ");
      d.designation = sc.next();
      System.out.println("Enter the salary: ");
      d.salary = sc.nextDouble();
      d.calculateSalary();
      d.displayEmployeeDetails();
    } 
    else if (type.equals("Tester")) {
      Tester t = new Tester();
      System.out.println("Enter the name: ");
      t.name = sc.next();
      System.out.println("Enter the age: ");
      t.age = sc.nextInt();
      System.out.println("Enter the designation: ");
      t.designation = sc.next();
      System.out.println("Enter the salary: ");
      t.salary = sc.nextDouble();
      t.calculateSalary();
      t.displayEmployeeDetails();
    } else {
      System.out.println("Invalid type of employee");
    }
  }
}