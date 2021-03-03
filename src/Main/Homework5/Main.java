package Main.Homework5;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Months[] monthArr = Months.values();
        Seasons[] seasonArr = Seasons.values();
        boolean k = true;

        do {
            System.out.println("MENU:");
            System.out.println("1: Search the Month;");
            System.out.println("2: Show all Months with the same season;");
            System.out.println("3: Show all Months with same number of days;");
            System.out.println("4: Show all Months with lower number of days;");
            System.out.println("5: Show all Months with bigger number of days;");
            System.out.println("6: Show the next season;");
            System.out.println("7: Show the previous season;");
            System.out.println("8: Show all Months with even numbers of days;");
            System.out.println("9: Show all Months with odd numbers of days;");
            System.out.println("10: Check if your Month has an even number of days.");
            System.out.println("Choose what do you need and write a number(1 - 10):");
            int choice = scan.nextInt();

            switch (choice){
                case 1:{
                    System.out.println("Please enter the Month:");
                    String month = scan.next().toUpperCase();
                    try {
                        if (Months.valueOf(month).toString().equals(month)){
                            System.out.println("We really have " + month + " in Months");
                        }
                    } catch (Exception e) {
                        System.out.println("We don't have " + month + " in Months");
                    }
                    System.out.println("Do you want continue?");
                    System.out.println("1: Yes");
                    System.out.println("2: No");
                    int answer = scan.nextInt();
                    if (answer == 2) {
                        k = false;
                    }
                    break;

                }
                case 2:{
                    System.out.println("Please enter the season:");
                    String season = scan.next().toUpperCase();
                    for (Months month : monthArr){
                        try {
                            if (month.getSeason().toString().equals(season)) {
                                System.out.print(month + " ");
                            }
                        }catch (Exception e){
                            System.out.println("You have written wrong season");

                        }
                    }
                    System.out.println();
                    System.out.println("Do you want continue?");
                    System.out.println("1: Yes");
                    System.out.println("2: No");
                    int answer = scan.nextInt();
                    if (answer == 2) {
                        k = false;
                    }
                    break;
                }
                case 3:{
                    System.out.println("Please enter number of days:");
                    int numDay = scan.nextInt();
                    int x = 0;
                    for (Months month : monthArr){
                            if (month.getNumDay() == numDay) {
                                System.out.print(month + " ");
                                x++;
                            }
                    }
                    System.out.println();
                    if (x == 0){
                        System.out.println("We don't have Months with this numbers of days");
                    }
                    System.out.println("Do you want continue?");
                    System.out.println("1: Yes");
                    System.out.println("2: No");
                    int answer = scan.nextInt();
                    if (answer == 2) {
                        k = false;
                    }
                    break;
                }
                case 4:{
                    System.out.println("Please enter number of days:");
                    int numDay = scan.nextInt();
                    int x = 0;
                    for (Months month : monthArr){
                        if (month.getNumDay() < numDay) {
                            System.out.print(month + " ");
                            x++;
                        }
                    }
                    System.out.println();
                    if (x == 0){
                        System.out.println("We don't have Months with this numbers of days");
                    }
                    System.out.println("Do you want continue?");
                    System.out.println("1: Yes");
                    System.out.println("2: No");
                    int answer = scan.nextInt();
                    if (answer == 2) {
                        k = false;
                    }
                    break;
                }
                case 5:{
                    System.out.println("Please enter number of days:");
                    int numDay = scan.nextInt();
                    int x = 0;
                    for (Months month : monthArr){
                        if (month.getNumDay() > numDay) {
                            System.out.print(month + " ");
                            x++;
                        }
                    }
                    System.out.println();
                    if (x == 0){
                        System.out.println("We don't have Months with this numbers of days");
                    }
                    System.out.println("Do you want continue?");
                    System.out.println("1: Yes");
                    System.out.println("2: No");
                    int answer = scan.nextInt();
                    if (answer == 2) {
                        k = false;
                    }
                    break;
                }
                case 6:{
                    System.out.println("Please enter a season:");
                    String season = scan.next().toUpperCase();
                    for (int i = 0; i < seasonArr.length; i++) {
                        if (season.equals("AUTUMN")){
                            System.out.println(seasonArr[0].toString());
                            break;
                        }
                        else if (seasonArr[i].toString().equals(season)){
                            System.out.println(seasonArr[i + 1].toString());
                        }
                    }
                    System.out.println("Do you want continue?");
                    System.out.println("1: Yes");
                    System.out.println("2: No");
                    int answer = scan.nextInt();
                    if (answer == 2) {
                        k = false;
                    }

                    break;
                }
                case 7:{
                    System.out.println("Please enter a season:");
                    String season = scan.next().toUpperCase();
                    for (int i = 0; i < seasonArr.length; i++) {
                        if (season.equals("WINTER")){
                            System.out.println(seasonArr[3].toString());
                            break;
                        }
                        else if (seasonArr[i].toString().equals(season)){
                            System.out.println(seasonArr[i - 1].toString());
                        }
                    }
                    System.out.println("Do you want continue?");
                    System.out.println("1: Yes");
                    System.out.println("2: No");
                    int answer = scan.nextInt();
                    if (answer == 2) {
                        k = false;
                    }

                    break;
                }
                case 8:{
                    for (Months month : monthArr){
                        if ((month.getNumDay() % 2) == 0){
                            System.out.print(month + " ");
                        }
                    }
                    System.out.println();
                    System.out.println("Do you want continue?");
                    System.out.println("1: Yes");
                    System.out.println("2: No");
                    int answer = scan.nextInt();
                    if (answer == 2) {
                        k = false;
                    }
                    break;
                }
                case 9:{
                    for (Months month : monthArr){
                        if ((month.getNumDay() % 2) != 0){
                            System.out.print(month + " ");
                        }
                    }
                    System.out.println();
                    System.out.println("Do you want continue?");
                    System.out.println("1: Yes");
                    System.out.println("2: No");
                    int answer = scan.nextInt();
                    if (answer == 2) {
                        k = false;
                    }
                    break;
                }
                case 10:{
                    System.out.println("Please enter a Month");
                    String month = scan.next().toUpperCase();
                    if ((Months.valueOf(month).getNumDay() % 2) == 0){
                        System.out.println(month + " have got even number of days");
                    }else {
                        System.out.println(month + " have got odd number of days");
                    }
                    System.out.println("Do you want continue?");
                    System.out.println("1: Yes");
                    System.out.println("2: No");
                    int answer = scan.nextInt();
                    if (answer == 2) {
                        k = false;
                    }
                    break;
                }
                default:{
                    System.out.println("You have entered a wrong number");
                    System.out.println("Do you want continue?");
                    System.out.println("1: Yes");
                    System.out.println("2: No");
                    int answer = scan.nextInt();
                    if (answer == 2) {
                        k = false;
                    }
                    break;
                }
            }

        }while (k);
    }

}
