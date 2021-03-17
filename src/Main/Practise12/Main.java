package Main.Practise12;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Person, Account> userAccounts = new HashMap<>();
        userAccounts.put(new Person("Mark", "J", 33), new Account("markJ", "afsfsa"));
        userAccounts.put(new Person("Tom", "H", 23), new Account("TOmO", "afsfsdaa"));
        userAccounts.put(new Person("Mark", "O", 12), new Account("markO", "afsfeeesa"));
        userAccounts.put(new Person("Sam", "J", 9), new Account("SamJ", "afsfsarr"));
        userAccounts.put(new Person("Pol", "Q", 19), new Account("PolQ", "afsfsqqqa"));

        // add new Account
        System.out.println("Task 1");
        Person person = new Person("Jack","R",17);
        Account account = new Account("JackR", "hhggftt");

        userAccounts.put(person,account);
        printMap(userAccounts);

        // change Account
        System.out.println("Task 2");
        changeAccount(userAccounts ,new Person("Pol", "Q"),new Account("asds", "sada") );
        changeAccount(userAccounts ,new Person("DEc", "Q"),new Account("asds", "sada") );
        Person person1 = new Person("Pol","Q");
        printMap(userAccounts);

        //delete account + person
        System.out.println("Task 3");
        userAccounts.remove(new Person("Tom", "H", 23));
        printMap(userAccounts);

        //is name available
        System.out.println("TAsk 4");
        System.out.println("robQ: " + isUsernameAvailable(userAccounts, "robQ"));
        System.out.println("polQ: " + isUsernameAvailable(userAccounts, "SamJ"));



    }
    private static void changeAccount(Map<Person, Account> userAccounts, Person person, Account newAccount){
        if (userAccounts.containsKey(person)){
            userAccounts.put(person, newAccount);
            System.out.println("Account was changed");
        }else {
            System.out.println("User is not found");
        }
    }

    private static boolean isUsernameAvailable(Map<Person, Account> userAccounts, String userName){
        return !userAccounts.containsValue(new Account(userName));
    }

    private static void printMap(Map<Person, Account> userAccounts){
        for (Map.Entry<Person, Account> userAccount: userAccounts.entrySet()){
            System.out.println("Key = " + userAccount.getKey()+ " / Value = " + userAccount.getValue());
        }
    }
}
