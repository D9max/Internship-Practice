 class Person {
  private String name;
  private int age;
  private Address address;

  public Person(String name, int age, Address address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Address getAddress() {
    return address;
  }
}

 class Address {
  private String state;
  private String city;
  private String zipCode;

  public Address(String state, String city, String zipCode) {
    this.state = state;
    this.city = city;
    this.zipCode = zipCode;
  }

  public String getState() {
    return state;
  }

  public String getCity() {
    return city;
  }

  public String getZipCode() {
    return zipCode;
  }
}

public class PersonAddressDetails {
  public static void main(String[] args) {
    Address address = new Address("Karnataka", "Sagar City", "56702");
    Person person = new Person("Mubarak M", 23, address);
    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());
    System.out.println("Address: " + person.getAddress().getCity() + ", " +
        person.getAddress().getState() + " " + person.getAddress().getZipCode());
  }
}
