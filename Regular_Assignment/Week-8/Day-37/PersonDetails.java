import java.util.ArrayList;

 class Person {
    private String name;
    private int age;

     Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

     String getName() {
        return name;
    }

     int getAge() {
        return age;
    }
}
public class PersonDetails{
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("mubarak", 25));
        people.add(new Person("salman", 30));
        people.add(new Person("siraj", 45));
        people.add(new Person("saheed", 20));
        people.add(new Person("amulya", 35));
        people.add(new Person("neha", 50));
        people.add(new Person("fairoz", 40));

        System.out.println("Name\tAge");
        for (Person person : people) {
            System.out.println(person.getName() + "\t" + person.getAge());
        }

        Person oldestPerson = people.get(0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        System.out.println("The oldest person is " + oldestPerson.getName() + ", aged " + oldestPerson.getAge() + ".");
    }
}
