package Main.Homework7;

public class Task1 {
    public static void main(String[] args) {
        String str = "I like Java !!!";
        System.out.println("Last character - " + str.charAt(str.length() - 1));
        System.out.println("String end with !!! - " + str.endsWith("!!!"));
        System.out.println("String start with I like - " +str.startsWith("I like"));
        if (str.indexOf("Java") > 0){
            System.out.println("String has substring Java");
        }else {
            System.out.println("String don't has substring Java");
        }
        System.out.println("Position of Java in string - " + str.indexOf("Java"));
        System.out.println("String after replacing - " + str.replaceAll("a", "o"));
        System.out.println("Upper case - " + str.toUpperCase());
        System.out.println("Lower case - " + str.toLowerCase());
        System.out.println("String without Java - " + str.substring(0, 6) + str.substring(11));


    }
}
