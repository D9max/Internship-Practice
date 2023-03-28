// Create an interface Animal with the following methods:
// public void speak();
// public void eat();
// Create classes Dog, Cat, and Cow that implement this interface. Write a program that accepts the type of animal and calls its speak() and eat() methods.

interface Animal{
	public void speak();
	public void eat();
}

class Dog implements Animal{
	public void speak(){
		System.out.println("Dog barks");
	}
	public void eat(){
		System.out.println("Dog eats");
	}
}

class Cat implements Animal{
	public void speak(){
		System.out.println("Cat meows");
	}
	public void eat(){
		System.out.println("Cat eats");
	}
}

class Cow implements Animal{
	public void speak(){
		System.out.println("Cow moos");
	}
	public void eat(){
		System.out.println("Cow eats");
	}
}

class AnimalUsingInterface{
	public static void main(String args[]){
		Dog d = new Dog();
		Cat c = new Cat();
		Cow co = new Cow();
		d.speak();
		d.eat();
		c.speak();
		c.eat();
		co.speak();
		co.eat();
	}
}