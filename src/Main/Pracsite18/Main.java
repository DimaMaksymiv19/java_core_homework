package Main.Pracsite18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Mark", 19));
        people.add(new Person("Tom", 10));
        people.add(new Person("Jack", 49));
        people.add(new Person("Sam", 17));
        people.add(new Person("Max", 29));
        List<Person> adults = new ArrayList<>();
        people.forEach(person -> {
            if(person.getAge() >= 18)
            {
                adults.add(person);
            }
        });
    }
}
