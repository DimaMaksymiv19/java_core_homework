package Main.Practise9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskForHomework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Please enter words(enter 'break' to exit)");

        do {
            String word = scan.next();
            words.add(word);
        } while (!words.contains("break"));
        printAllEl(words);


    }
    private static void printAllEl(List<String> list){
        for (String el : list){
            System.out.print(el + " ");
            System.out.println();
        }
    }
    private static void printAllWithS(List<String> list){
        for (String el : list){
            if (el.startsWith("s")){
                System.out.print(el + " ");
                System.out.println();
            }
        }
    }
    private static void printAllWithsFiveSim(List<String> list){
        for (String el : list){
            if (el.length() >= 5){
                System.out.print(el + " ");
                System.out.println();
            }
        }
    }
}
