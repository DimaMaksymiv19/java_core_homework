package Main.Practise;

import java.util.Scanner;

public class Java_core_practice_2 {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть суму грошей:");
        int money = input.nextInt();
        System.out.println("Введіть проценти:");
        int profit = input.nextInt();
        System.out.println("Введіть кількість років:");
        int years = input.nextInt();
        int result = 0;
        for(int i = 1; i <= years; i++){
            int y = money;
            int x = (profit / 100) + y;
            money = y + x;

        }
        System.out.println("Вихідна сума");
        System.out.println(money);


        System.out.println("Task 3");
        Double [][] Array = new Double[5][7];
        for(int i = 0; i < Array.length; i ++){
            for(int j = 0; j < Array[0].length; j++){
                Array[i][j] = (Math.random() * (-2 - 76)) - 2;
                System.out.print(Array[i][j].intValue() + " ");
            }
            System.out.println();
        }
        System.out.println("Task 2");
        int [] array2 = new int [5];
        for (int i = 0; i < array2.length; i++){
            System.out.println("Введіть "+ i + " елемент масиву");
            array2[i] = input.nextInt();
        }
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--){
            System.out.print(array2[i] + " ");

        }



    }
}
