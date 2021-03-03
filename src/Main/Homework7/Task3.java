package Main.Homework7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter element number " + i);
            array[i] = scan.next();
        }

        for (String el:array ){
            if (((el.length() % 2) == 0) && el.startsWith("a")){
                System.out.println(el);
            }
        }
    }
}
