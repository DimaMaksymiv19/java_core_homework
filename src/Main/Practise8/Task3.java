package Main.Practise8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String str = "I love Java more than my friend. Java is so beautiful.\n" +
                " I'm using jdk 1.8, because jdk11 and jdk15 make some troubles on my laptop.";

        Pattern regex = Pattern.compile("jdk\s?[0-9][.]?[0-9]");
        Matcher matcher = regex.matcher(str);
        if(matcher.find()){
            System.out.println(matcher.replaceAll("[removed]"));
        }
    }

}
