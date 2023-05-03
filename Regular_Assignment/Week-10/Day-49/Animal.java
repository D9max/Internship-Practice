/*animal
  color
  nooflegs
dog --animal

  bark()

babydog ==dog

  weep()

  cat-->animal

  meow()*/

class Animal {
  protected String color;
  protected int numberOfLegs;

  public Animal(String color, int numberOfLegs) {
    this.color = color;
    this.numberOfLegs = numberOfLegs;
  }

  public void makeSound() {
    System.out.println("The animal makes a sound.");
  }
}

class Dog extends Animal {
  public Dog(String color, int numberOfLegs) {
    super(color, numberOfLegs);
  }

  public void makeSound() {
    bark();
  }

  public void bark() {
    System.out.println("The dog barks.");
  }
}

class BabyDog extends Dog {
  public BabyDog(String color, int numberOfLegs) {
    super(color, numberOfLegs);
  }

  public void weep() {
    System.out.println("The baby dog weeps.");
  }
}

class Cat extends Animal {
  public Cat(String color, int numberOfLegs) {
    super(color, numberOfLegs);
  }

  public void makeSound() {
    meow();
  }

  public void meow() {
    System.out.println("The cat meows.");
  }
}

public class AnimalDetails {
  public static void main(String[] args) {
    Animal animal = new Animal("Brown", 4);
    animal.makeSound();

    Dog dog = new Dog("White", 4);
    dog.makeSound();

    BabyDog babyDog = new BabyDog("Black", 4);
    babyDog.makeSound();
    babyDog.weep();

    Cat cat = new Cat("Gray", 4);
    cat.makeSound();
  }
}
