package Main.Practise11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Buy> buys = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean k = true;

        while (k) {
            System.out.println("Enter name");
            String name = scan.next();

            System.out.println("Enter enum");
            int number = scan.nextInt();
            Buy buy = new Buy(name, number);
            buys.add(buy);

            k = wantToContinue();

        }

        System.out.println("Task 1: ");
        Set<Buy> treeBuy = new TreeSet<>(buys);
        for (Buy el : treeBuy) {
            System.out.println(el);
        }
        System.out.println("Task 2: ");
        Set<Buy> linkedBuy = new LinkedHashSet<>(buys);
        for (Buy el : linkedBuy) {
            System.out.println(el);
        }
        System.out.println("Task 3: ");
        Set<Buy> treeBuy2 = new TreeSet<>(new BuyNumberComparator());
        treeBuy2.addAll(buys);
        for (Buy el : treeBuy2) {
            System.out.println(el);
        }
        System.out.println("Task 4: ");
        Set<Buy> hashBuy = new HashSet<>(buys);
        for (Buy el : hashBuy) {
            System.out.println(el);

        }
    }
    public static boolean wantToContinue(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to continue?");
        System.out.println("1: Yes");
        System.out.println("2: No");
        boolean k = true;
        try {
            int chooseContinue = scan.nextInt();
            if (chooseContinue == 2){
                k = false;
            }
        }catch (Exception o){
            System.out.println("You haven't written a number");
        }
        return k;

}
}