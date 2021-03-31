package Main.Homework12;

import java.util.*;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Person, List<Animal>> map = new HashMap<>();
        map.put(new Person("Jack", 32), Arrays.asList(new Animal("Dog", "Rex"),
                new Animal("Rabbit", "Bunny")));
        map.put(new Person("Poll", 21), Arrays.asList(new Animal("Cat", "Murka")));
        map.put(new Person("Mark", 32), Arrays.asList(new Animal("Snake", "Rick"),
                new Animal("Mouse", "Mini"), new Animal("Tiger", "Shape")));

        boolean k = true;
        while (k) {
            System.out.println("1: Add person to club");
            System.out.println("2: Add animal to person");
            System.out.println("3: Delete animal from person");
            System.out.println("4: Delete person from club");
            System.out.println("5 Show all people and their animals");
            System.out.println("6: Exit");
            System.out.println("(Please enter a number from 1 to 6)");

            int mainChoose = 6;
            try {
                mainChoose = scan.nextInt();
            } catch (Exception o) {
                System.out.println("You haven't entered a number!");
            }

            switch (mainChoose) {
                case 1: {
                    addPerson(map);
                    printMap(map);
                    k = wantToContinue();
                    break;
                }
                case 2: {
                    addAnimal(map);
                    k = wantToContinue();
                    break;
                }
                case 3: {
                    deleteAnimal(map,"Mark",32);
                    k = wantToContinue();
                    break;
                }
                case 4: {
                    deletePerson(map);
                    k = wantToContinue();
                    break;
                }
                case 5: {
                    printMap(map);
                    k = wantToContinue();
                    break;
                }
                case 6: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Your number is out of range");
                    k = wantToContinue();
                }
            }

        }


    }

    public static boolean wantToContinue() {
        System.out.println("Do you want to continue?");
        System.out.println("1: Yes");
        System.out.println("2: No");
        boolean k = true;
        try {
            int chooseContinue = scan.nextInt();
            if (chooseContinue == 2) {
                k = false;
            }
        } catch (Exception o) {
            System.out.println("You haven't written a number");
        }
        return k;
    }

    private static void printMap(Map<Person, List<Animal>> userAccounts) {
        for (Map.Entry<Person, List<Animal>> userAccount : userAccounts.entrySet()) {
            System.out.println("Key = " + userAccount.getKey() + " / Value = " + userAccount.getValue());
        }
    }

    private static void addPerson(Map<Person, List<Animal>> map) {
        System.out.println("Please enter a person name");
        String nameForAdd = scan.next();
        System.out.println("Please enter a age of person");
        int ageForAdd = 0;
        try {
            ageForAdd = scan.nextInt();
        } catch (Exception o) {
            System.out.println("You haven't written a number!");
        }
        map.put(new Person(nameForAdd, ageForAdd), Arrays.asList());
    }

    private static void addAnimal(Map<Person, List<Animal>> map) {
        System.out.println("Please enter a person name");
        String nameSearch = scan.next();
        boolean haveNameInMap = false;
        for (Map.Entry<Person, List<Animal>> mapEl : map.entrySet()) {
            if (nameSearch.equals(mapEl.getKey().getName())) {
                System.out.println("Please enter animal type");
                String typeForAdd = scan.next();
                System.out.println("Please enter animal name");
                String animalNameForAdd = scan.next();
                mapEl.setValue(Arrays.asList(new Animal(typeForAdd, animalNameForAdd)));
                haveNameInMap = true;
                System.out.println("Animal successful added");
            }
        }
        if (!haveNameInMap) {
            System.out.println("There are not this name in the map");
        }
    }

    private static void deletePerson(Map<Person, List<Animal>> map) {
        System.out.println("Please enter a person name");
        String nameSearch = scan.next();
        boolean haveName = false;
        for (Map.Entry<Person, List<Animal>> mapEl : map.entrySet()) {
            if (nameSearch.equals(mapEl.getKey().getName())) {
                map.remove(mapEl.getKey());
                haveName = true;
                System.out.println("Person was successfully deleted");
                break;
            }
        }
        if (!haveName) {
            System.out.println("There are not this name in the map");
        }
    }

    private static void deleteAnimal(Map<Person, List<Animal>> map, String name, int age)
    {
        Person personForSearch = new Person(name, age);

        if (map.containsKey(personForSearch))
        {
            System.out.println("Please enter animal type");
            String animalTypeDelete = scan.next();
            System.out.println("Please enter animal name");
            String animalNameForDelete = scan.next();

            Animal animalDelete = new Animal(animalTypeDelete, animalNameForDelete);
            Iterator<Animal> animalIterator = ((ArrayList)map.get(personForSearch)).iterator();
            while (animalIterator.hasNext())
            {
                if (animalIterator.next().equals(animalDelete))
                {
                    animalIterator.remove();
                    break;
                }
            }
        }

    }
}

