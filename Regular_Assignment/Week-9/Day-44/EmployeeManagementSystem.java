/*create class called Employee
Accept Employee details such as id,name,address,profession,salary and create 5 employee details
create ArrayList and all these user defined objects into ArrayList
you have to perfrom these tasks and it should be menu driven
1.add employee
2.Update employee employee salary based on id
3.remove employee based on employee id
4.Search employee name based on employee id, if it is found display otherwise if it not found throw NameNotFoundException custom Exception
5.Exit*/

import java.util.ArrayList;
import java.util.*;

class Employee{
  private int id;
  private String name;
  private String address;
  private String profession;
  private double salary;

  public Employee(int id, String name, String address, String profession, double salary){
    this.id=id;
    this.name=name;
    this.address=address;
    this.profession=profession;
    this.salary=salary;
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public String getAddress(){
    return address;
  }
  public String getProfession(){
    return profession;
  }
  public double getSalary(){
    return salary;
  }
  public void setSalary(double salary){
    this.salary = salary;
  }
  public String toString(){
    return "Employee " + id + ": " + name + ", " + address + ", " + profession + ", " + salary;
  }
}
class NameNotFoundException extends Exception{
  public NameNotFoundException(String message){
    super(message);
  }
}
public class EmployeeManagementSystem{
  private static ArrayList<Employee> employees=new ArrayList<Employee>();
  private static Scanner sc = new Scanner (System.in);
  public static void main(String[] args) {
        boolean quit = false;
        int menuItem;
        
        do {
            printMenu();
            System.out.print("Choose menu : ");
            menuItem = sc.nextInt();
            
            switch (menuItem) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    updateEmployeeSalary();
                    break;
                case 3:
                    removeEmployee();
                    break;
                case 4:
                    searchEmployeeByName();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid menu item.");
            }
        } while (!quit);
        
        System.out.println("Exiting...");
    }
    
    private static void printMenu() {
        System.out.println("Employee Management System ");
        System.out.println("1. Add Employee");
        System.out.println("2. Update Employee Salary");
        System.out.println("3. Remove Employee");
        System.out.println("4. Search Employee Name");
        System.out.println("5. Quit");
    }
    
    private static void addEmployee() {
        System.out.println("Add Employee");
        
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        
        System.out.print("Enter Name: ");
        String name = sc.next();
        
        System.out.print("Enter Address: ");
        String address = sc.next();
        
        System.out.print("Enter Profession: ");
        String profession = sc.next();
        
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        
        Employee employee = new Employee(id, name, address, profession, salary);
        employees.add(employee);
        
        System.out.println("Employee added: " + employee);
    }
    
    private static void updateEmployeeSalary() {
        System.out.println("Update Employee Salary");
        
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            System.out.print("Enter new Salary: ");
            double salary = sc.nextDouble();
            employee.setSalary(salary);
            System.out.println("Employee updated: " + employee);
        } else {
            System.out.println("Employee not found.");
        }
    }
  private static void removeEmployee() {
System.out.println("Remove Employee");
    System.out.print("Enter ID: ");
    int id = sc.nextInt();
    
    Employee employee = findEmployeeById(id);
    if (employee != null) {
        employees.remove(employee);
        System.out.println("Employee removed: " + employee);
    } else {
        System.out.println("Employee not found.");
    }
}

private static void searchEmployeeByName() {
    System.out.println("Search Employee Name");
    
    System.out.print("Enter ID: ");
    int id = sc.nextInt();
    
    Employee employee = findEmployeeById(id);
    if (employee != null) {
        System.out.println("Employee Name: " + employee.getName());
    } else {
        try {
            throw new NameNotFoundException("Employee not found.");
        } catch (NameNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

private static Employee findEmployeeById(int id) {
    for (Employee employee : employees) {
        if (employee.getId() == id) {
            return employee;
        }
    }
    return null;
}

  }
