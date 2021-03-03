package Main.Homework7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter element number " + i);
            array[i] = scan.next();
        }
        int maxWord = array[0].length();
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxWord){
                maxWord = array[i].length();
                k = i;
            }
        }
        System.out.println("The biggest word is - " + array[k]);



    }
}
