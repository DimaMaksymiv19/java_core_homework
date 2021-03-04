package Main.Practise8;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Pattern regex = Pattern.compile("^a");
        Scanner scan = new Scanner(System.in);
        String [] arr = new String[5];


        for (int i = 0; i < arr.length; i++) {
            String word = scan.next();
            Matcher matcher = regex.matcher(word);
            if(matcher.find()){
                arr[i] = word;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
