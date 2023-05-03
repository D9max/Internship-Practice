/*Create an abstract class Animal with the following properties and methods:
Properties:
name: a String representing the name of the animal
Methods:
move(): an abstract method that represents how the animal moveseat(): a method that prints a message saying the animal is eatinggetName(): a method that returns the name of the animal
Create two concrete classes that extend the Animal class: Dog and Bird. Each class should have its own implementation of the move() method. For example, a Dog may move by walking on four legs, while a Bird may move by flying.
Finally, write a Main class that creates instances of Dog and Bird, sets their names, and calls their move() and eat() methods. Print messages to indicate how each animal moves and that they are eating.*/
abstract class Animal {
  String name;

  Animal(String name) {
    this.name = name;
  }

  abstract void move();

  void eat() {
    System.out.println(name + " is eating.");
  }

  String getName() {
    return name;
  }
}

class Dog extends Animal {
  Dog(String name) {
    super(name);
  }

  void move() {
    System.out.println(name + " is walking on four legs.");
  }
}

class Bird extends Animal {
  Bird(String name) {
    super(name);
  }

  void move() {
    System.out.println(name + " is flying.");
  }
}

public class AnimalUsingAbstract {
  public static void main(String[] args) {
    Dog dog = new Dog("dog");
    Bird bird = new Bird("Bird");

    dog.move();
    dog.eat();
    System.out.println("Name of dog: " + dog.getName());

    bird.move();
    bird.eat();
    System.out.println("Name of bird: " + bird.getName());
  }
}