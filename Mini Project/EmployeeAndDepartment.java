/*Create a program that simulates an organization with different types of employees and departments. The program should have the following classes/interfaces:
Employee - This is an abstract class that has the properties of an employee such as name, age, salary, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.
Department - This is an abstract class that has the properties of a department such as name, budget, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also have an interface named "Operation" that has a method named "performOperation" which will be implemented by different department operations such as hiring, firing, budget allocation, etc.
Manager - This is a derived class of the Employee class. It should have additional properties such as team, department, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.
Developer - This is a derived class of the Employee class. It should have additional properties such as technology, experience, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.
Marketing - This is a derived class of the Department class. It should have additional properties such as campaigns, events, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also implement the "Operation" interface with a method implementation of the "performOperation" method that will simulate marketing campaigns and events.
IT - This is a derived class of the Department class. It should have additional properties such as technology, infrastructure, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also implement the "Operation" interface with a method implementation of the "performOperation" method that will simulate IT operations such as hiring, firing, and budget allocation.
In the main method, create objects of different types of employees and departments, and simulate employee management and department operations by calling the "performOperation" method of the respective department.*/

public abstract class Employee {
  private String name;
  private int age;
  private double salary;
  public Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
 }
  public String getName() {
     return name;
 }
  public int getAge() {
     return age;
 }
  public double getSalary() {
      return salary;
 }
  public void setSalary(double salary) {
      this.salary = salary;
    }
}
  public abstract class Department {
      private String name;
      private double budget;
  
      public Department(String name, double budget) {
          this.name = name;
          this.budget = budget;
    }
      public String getName() {
          return name;
    }
      public double getBudget() {
          return budget;
    }
      public void setBudget(double budget) {
        this.budget = budget;
    }
      public interface Operation {
        void performOperation();
    }
}
public class Manager extends Employee {
      private String team;
      private Department department;
  
      public Manager(String name, int age, double salary, String team, Department department) {
          super(name, age, salary);
          this.team = team;
          this.department = department;
      }
  
      public String getTeam() {
          return team;
      }
  
      public Department getDepartment() {
          return department;
      }
  }
public class Developer extends Employee {
    private String technology;
    private int experience;

    public Developer(String name, int age, double salary, String technology, int experience) {
        super(name, age, salary);
        this.technology = technology;
        this.experience = experience;
    }

    public String getTechnology() {
        return technology;
    }

    public int getExperience() {
        return experience;
    }
}
public class Marketing extends Department implements Department.Operation {
    private int campaigns;
    private int events;

    public Marketing(String name, double budget, int campaigns, int events) {
        super(name, budget);
        this.campaigns = campaigns;
        this.events = events;
    }

    public int getCampaigns() {
        return campaigns;
    }

    public int getEvents() {
        return events;
    }
  public void performOperation() {
        System.out.println("Performing marketing campaigns and events...");
    }
}
public class IT extends Department implements Department.Operation {
    private String technology;
    private int infrastructure;

    public IT(String name, double budget, String technology, int infrastructure) {
        super(name, budget);
        this.technology = technology;
        this.infrastructure = infrastructure;
    }

    public String getTechnology() {
        return technology;
    }

    public int getInfrastructure() {
        return infrastructure;
    }
  public void performOperation() {
        System.out.println("Performing IT operations such as hiring, firing, and budget allocation...");
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Manager manager = new Manager("Mubarak M", 23, 100000, "Sales", new Marketing("Marketing", 50000, 5, 10));
        Developer developer = new Developer("Mehboob Khan", 22, 70000, "Java", 3);
        Marketing marketing = new Marketing("Marketing", 50000, 5, 10);
        IT it = new IT("IT", 100000, "Java", 50);
    System.out.println(manager.getName() + " manages the " + manager.getTeam() + " team in the " + manager.getDepartment().getName() + " department with a budget of $" + manager.getDepartment().getBudget());
    System.out.println(developer.getName() + " works with " + developer.getTechnology() + " technology and has " + developer.getExperience() + " years of experience");

    System.out.println(marketing.getName() + " department has " + marketing.getCampaigns() + " campaigns and " + marketing.getEvents() + " events");
    marketing.performOperation();

    System.out.println(it.getName() + " department has " + it.getInfrastructure() + " infrastructure and specializes in " + it.getTechnology() + " technology");
    it.performOperation();
}
}
