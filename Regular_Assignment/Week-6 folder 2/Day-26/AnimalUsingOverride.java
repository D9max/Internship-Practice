//Write a program that demonstrates the use of the super keyword in method overriding. Define a superclass called Animal with a method called speak() that prints "Animal speaks". Define a subclass called Dog that extends Animal and overrides the speak() method to print "Dog barks". In the Dog class, call the speak() method of the Animal class using the super keyword.
class Animal {
  void speak() {
    System.out.println("Animal Speaks");
  }
}

class Dog extends Animal {
  void speak() {
    System.out.println("Dog barks");
    super.speak();
  }
}

public class AnimalUsingOverride {
  public static void main(String args[]) {
    Animal a = new Animal();
    a.speak();

    Dog d = new Dog();
    d.speak();
  }
}
