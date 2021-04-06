package Main.Howemork20;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Mark", 23,"male");
        Person person2 = new Person("Rob", 15,"male");
        Person person7 = new Person("Rob", 91,"male");
        Person person8 = new Person("Joe", 8,"male");
        Person person3 = new Person("July", 26,"female");
        Person person4 = new Person("Jake", 27,"male");
        Person person5 = new Person("Bella", 43,"female");
        Person person6 = new Person("Becky", 78,"female");
        Person person9 = new Person("Anna", 18,"female");
        Person person10 = new Person("Alisa", 12,"female");

        List<Person> people = new ArrayList<>();
        people.add(person9);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person10);

        System.out.println("Task 1:");
        List<Person> menForArmy = people.stream().filter(person -> person.getSex().equals("male") && person.getAge() >= 18 && person.getAge() <= 27)
                .collect(Collectors.toList());
        menForArmy.forEach(System.out::println);

        OptionalDouble maleAgeAVG = people.stream().filter(person -> person.getSex().equals("male"))
                .mapToInt(Person::getAge)
                .average();
        System.out.println();
        System.out.println("Task 2: AVG of male age is:");
        System.out.println(maleAgeAVG);

        System.out.println();
        System.out.println("Task 3:");
        List<Person> peopleReadyForJob = people.stream().filter(person -> (person.getSex().equals("male") && person.getAge() >= 18 && person.getAge() <= 60)
                || (person.getAge() >= 18 && person.getAge() <= 55))
                .collect(Collectors.toList());
        peopleReadyForJob.forEach(System.out::println);

        System.out.println();
        System.out.println("Task 4:");
        List<Person> reverseSortByName = people.stream().sorted().collect(Collectors.toList());
        reverseSortByName.forEach(System.out::println);


//        people.stream().sorted((person, personn) -> {
//            int result = person.getName().compareTo(personn.getName());
//            if (result == 0){
//                if(person.getAge() > personn.getAge()){
//                    result = 1;
//                }else if (person.getAge() < personn.getAge()){
//                    result = -1;
//                }else {
//                    result = 0;
//                }
//            }
//        return result;})
//                .forEach(System.out::println);
        System.out.println();
        System.out.println("Task 5");
        people.stream().sorted(Comparator.comparing(Person::getName).thenComparingInt(Person::getAge))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Task 6");
        Optional<Person> personMaxAge = people.stream().max(Comparator.comparingInt(Person::getAge));
        System.out.println(personMaxAge);

        System.out.println();
        System.out.println("Task 7");
        Optional<Person> personMinAge = people.stream().min(Comparator.comparingInt(Person::getAge));
        System.out.println(personMinAge);

        System.out.println();
        System.out.println("Task 8");
        long numOfMen = people.stream().filter(person -> person.getSex().equals("male")).count();
        System.out.println(numOfMen);

        System.out.println();
        System.out.println("Task 9");
        long numOfFemale = people.stream().filter(person -> person.getSex().equals("female")).count();
        System.out.println(numOfFemale);

        System.out.println();
        System.out.println("Task10");
        List<Person> femaleStartA = people.stream().filter(person -> person.getSex().equals("female") && person.getName().indexOf("A") == 0)
                .collect(Collectors.toList());
        femaleStartA.forEach(System.out::println);


    }
}
