package Main.Practise8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {


        Pattern regex = Pattern.compile("@gmail.com$");
        Scanner scan = new Scanner(System.in);
        List<String> emails = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String email = scan.next();
            Matcher matcher = regex.matcher(email);
            if (matcher.find()){
                emails.add(email);
            }
        }
        System.out.println(emails.toArray().length);
    }
}
