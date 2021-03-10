package Main.Practise10;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(612);
        numbers.add(322);
        numbers.add(41);
        numbers.add(134);
        numbers.add(235);

        System.out.println(numbers);

        ListIterator<Integer> listIterator = numbers.listIterator();

        while (listIterator.hasNext()){
            numbers.set(listIterator.nextIndex(), listIterator.next() * 5 + 1);
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();

        Person person1 = new Person("Dima",19, "sdoaksd@gmail.com");
        Person person2 = new Person("Olya",19, "olga@gmail.com");
        Person person3 = new Person("Yura",23, "yuraboss@gmail.com");
        Person person4 = new Person("Aura",23, "js@gmail.com");
        Person person5 = new Person("Aura",24, "kgfdguraboss@gmail.com");
        Person person6 = new Person("Aura",15, "ayurboss@gmail.com");

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);

        Collections.sort(people);
        for (Person person : people){
            System.out.println(person);
        }

        System.out.println();

        Collections.sort(people, new PersonEmailLengthComparator());
        for (Person person : people){
            System.out.println(person);
        }

//        List<Person>
//
//        Collections.sort();
    }
}
