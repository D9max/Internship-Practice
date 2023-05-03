class Person {
  String name;
  int age;
  Address address;
}

class Address {
  String state;
  String city;
  String zipCode;
}

public class PersonAddressDetails {
  public static void main(String[] args) {
    Address address = new Address();
    address.state = "Karnataka";
    address.city = "sagar kundapur";
    address.zipCode = "577401";

    Person person = new Person();
    person.name = "Mubarak M";
    person.age = 23;
    person.address = address;

    System.out.println("Name: " + person.name);
    System.out.println("Age: " + person.age);
    System.out.println("Address: " + person.address.city + ", " +
        person.address.state + " " + person.address.zipCode);
  }
}
  