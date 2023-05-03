class Person {
  String name;
  int age;
  Address address;

  Person(String name, int age, Address address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }
}

class Address {
  String state;
  String city;
  String zipCode;

  Address(String state, String city, String zipCode) {
    this.state = state;
    this.city = city;
    this.zipCode = zipCode;
  }
}

public class PersonUsingConstructor {
  public static void main(String[] args) {
    Address address = new Address("Karnataka", "sagar city", "577401");
    Person person = new Person("Mubarak M", 23, address);
    System.out.println("Name: " + person.name);
    System.out.println("Age: " + person.age);
    System.out.println("Address: " + person.address.city + ", " +
        person.address.state + " " + person.address.zipCode);
  }
}
