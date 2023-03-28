class Animal {
  String name;

  Animal(String name) {
    this.name = name;
  }

  void speak() {
    System.out.println("Animal speaks");
  }
}

class Dog extends Animal {
  Dog(String name) {
    super(name);
  }

  void speak() {
    super.speak(); 
    System.out.println("Dog barks");
  }
}

public class UsingSuperKeyword {
  public static void main(String[] args) {
    Dog dog = new Dog("Fido");
    System.out.println("Dog's name is " + dog.name);
    dog.speak();
  }
}
