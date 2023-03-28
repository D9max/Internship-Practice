class Animal {
    protected void display() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}