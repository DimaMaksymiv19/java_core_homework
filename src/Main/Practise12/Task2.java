package Main.Practise12;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<Person, List<Account>> userAccounts = new HashMap<>();
        userAccounts.put(new Person("Mark", "J", 33), Arrays.asList(new Account("sdf", "wwe"),
                new Account("sww", "qqe")));
        userAccounts.put(new Person("Bob", "G", 23), Arrays.asList(new Account("eee", "qqq"),
                new Account("xxx", "xxe")));
        userAccounts.put(new Person("Poll", "Q", 31), Arrays.asList(new Account("ttr", "qwe")));
        userAccounts.put(new Person("Bill", "K", 33), Arrays.asList(new Account("trr", "ewq")));

        System.out.println("Add people");
        Person person = new Person("Jack","R",17);
        Account account = new Account("JackR", "hhggftt");

      //  userAccounts.put(person, (List<Account>) account);
        printMap(userAccounts);




    }
    private static void printMap(Map<Person, List<Account>> userAccounts){
        for (Map.Entry<Person, List<Account>> userAccount: userAccounts.entrySet()){
            System.out.println("Key = " + userAccount.getKey()+ " / Value = " + userAccount.getValue());
        }
    }
}
