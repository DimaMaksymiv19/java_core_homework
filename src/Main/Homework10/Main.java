package Main.Homework10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Commodity product = new Commodity("Table", 15.5f, 13, 21.44f);
        Commodity product5 = new Commodity("Tabee", 15.5f, 13, 21.44f);
        Commodity product3 = new Commodity("Aable", 15.5f, 13, 21.44f);
        Commodity product4 = new Commodity("Bable", 15.5f, 13, 21.44f);
        ArrayList<Commodity> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);


        boolean k = true;
        while (k) {
            System.out.println("MENU:");
            System.out.println("1: Add a product;");
            System.out.println("2: Delete a product;");
            System.out.println("3: Change a product;");
            System.out.println("4: Sort by name;");
            System.out.println("5: Sort by length;");
            System.out.println("6: Sort by width;");
            System.out.println("7: Sort by weight;");
            System.out.println("8: Show a product;");
            System.out.println("9: Exit;");
            System.out.println("10: Search by name");
            System.out.println("(Please enter a number from 1 to 9)");

            int choose = 9;
            try {
                choose = scan.nextInt();
            } catch (Exception o) {
                System.out.println("You haven't entered a number!");
            }

            switch (choose) {
                case 1: {
                    addProduct(productList);
                    showProducts(productList);
                    k = wantToContinue();
                    break;
                }
                case 2: {
                    showProducts(productList);
                    deleteProduct(productList);
                    k = wantToContinue();
                    break;
                }
                case 3: {
                    showProducts(productList);
                    changeProduct(productList);
                    showProducts(productList);
                    k = wantToContinue();
                    break;
                }
                case 4: {
                    Collections.sort(productList);
                    showProducts(productList);
                    k = wantToContinue();
                    break;
                }
                case 5: {
                    Collections.sort(productList, new CommodityLengthComparator());
                    showProducts(productList);
                    k = wantToContinue();
                    break;
                }
                case 6: {
                    Collections.sort(productList, new CommodityWidhtComparator());
                    showProducts(productList);
                    k = wantToContinue();
                    break;
                }
                case 7: {
                    Collections.sort(productList, new CommodityWeigthComparator());
                    showProducts(productList);
                    k = wantToContinue();
                    break;
                }
                case 8: {
                    showProducts(productList);
                    System.out.println("Enter number of product");
                    int number = scan.nextInt();
                    System.out.println(productList.get(number));
                    k = wantToContinue();

                    break;
                }
                case 9: {
                    System.exit(0);
                    break;
                }
                case 10:{
                    System.out.println("Please enter name or part of name of product");
                    String namePart = scan.next();
                    for (Commodity el : productList){
                        Pattern regex = Pattern.compile(namePart);
                        Matcher matcher = regex.matcher("(.)*" + el.getName() + "(.)*");
                        if (matcher.find()){
                            System.out.println(el);
                        }
                    }
                    wantToContinue();
                    break;
                }
                default: {
                    System.out.println("Your number is wrong!");
                    k = wantToContinue();
                }
            }
        }




    }

    public static void addProduct(ArrayList<Commodity> productList){
        System.out.println("Enter product name: ");
        String productName = scan.next();

        System.out.println("Enter length of product");
        float productLength = 0.0f;
        try {
            productLength = scan.nextFloat();
        } catch (Exception o) {
            System.out.println("You haven't entered a number");
        }

        System.out.println("Enter width of product");
        float productWidth = 0.0f;
        try {
            productWidth = scan.nextFloat();
        } catch (Exception o) {
            System.out.println("You haven't entered a number");
        }

        System.out.println("Enter weight of product");
        float productWeight = 0.0f;
        try {
            productWeight = scan.nextFloat();
        } catch (Exception o) {
            System.out.println("You haven't entered a number");
        }
        Commodity product2 = new Commodity(productName, productLength, productWidth, productWeight);
        productList.add(product2);
    }

    public static boolean wantToContinue(){
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

    public static void showProducts(ArrayList<Commodity> productList){
        System.out.println("Now list of products looks like:");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(i + 1 +" "+ productList.get(i));
        }
    }

    public static void deleteProduct(ArrayList<Commodity> productList){
        System.out.println("Enter a number of product that you want to delete");
        try {
            int number = scan.nextInt();
            productList.remove(number);
            showProducts(productList);

        }catch (Exception o){
            System.out.println();
        }
    }

    public static void changeProduct(ArrayList<Commodity> productList){
        System.out.println("Enter a number of product that you want to change");
        int number = 0;
        try {
            number = scan.nextInt();
            productList.remove(number);
        }catch (Exception o){
            System.out.println();
        }
        System.out.println("Enter product name: ");
        String productName = scan.next();

        System.out.println("Enter length of product");
        float productLength = 0.0f;
        try {
            productLength = scan.nextFloat();
        } catch (Exception o) {
            System.out.println("You haven't entered a number");
        }

        System.out.println("Enter width of product");
        float productWidth = 0.0f;
        try {
            productWidth = scan.nextFloat();
        } catch (Exception o) {
            System.out.println("You haven't entered a number");
        }

        System.out.println("Enter weight of product");
        float productWeight = 0.0f;
        try {
            productWeight = scan.nextFloat();
        } catch (Exception o) {
            System.out.println("You haven't entered a number");
        }
        Commodity product2 = new Commodity(productName, productLength, productWidth, productWeight);
        productList.add(number - 1 , product2);
    }
}
