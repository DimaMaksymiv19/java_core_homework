package Main.Homework11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Man man1 = new Man("Mark", 19);
        Man man12 = new Man("Mark", 20);
        Man man2 = new Man("Bill", 31);
        Man man3 = new Man("John", 25);
        Man man4 = new Man("Kevin", 15);
        Man man44 = new Man("Kevin", 15);

        ArrayList<Man> men = new ArrayList<>();
        men.add(man1);
        men.add(man2);
        men.add(man3);
        men.add(man4);
        men.add(man44);
        men.add(man12);

        System.out.println("Task 1(ArrayList) :");
        for (Man el : men){
            System.out.println(el);
        }

        System.out.println("Task 2 (Sorted ArrayList):");
        Collections.sort(men);
        for (Man el : men){
            System.out.println(el);
        }

        System.out.println("Task 3 (HashSet):");
        Set<Man> hashMen = new HashSet<>(men);
        for (Man el : hashMen){
            System.out.println(el);
        }

        System.out.println("Task 4 (LinkedHashSet):");
        Set<Man> linkedHashMen = new LinkedHashSet<>(men);
        for (Man el : linkedHashMen){
            System.out.println(el);
        }
        System.out.println("Task 5 (TreeSet):");
        Set<Man> treeMen = new TreeSet<>(men);
        for (Man el : treeMen){
            System.out.println(el);
        }
    }
}
