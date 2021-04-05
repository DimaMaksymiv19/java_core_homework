package Main.Homewok18;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTask {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person(null, 18));
        list.add(null);
        list.add(new Person("Matt", 19));
        list.add(new Person("Mark", 22));
        list.add(null);
        list.add(new Person(null, 33));
        // default name - Joe

        list.forEach(person -> {
            Optional<Person> optionalPerson = Optional.ofNullable(person);
            if(optionalPerson.isPresent())
            {
                Optional<String> name = Optional.ofNullable(optionalPerson.get().getName());
                System.out.println(name.orElse("Joe"));
            }
            else
                {
                    optionalPerson = Optional.of(new Person("Joe", 0));
                    System.out.println(optionalPerson.get().getName());
                }
        });
}
}
