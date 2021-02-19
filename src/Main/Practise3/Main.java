package Main.Practise3;

public class Main {
    public static void main(String[] args) {
        Rose rose = new Rose("red", 50);
        Tulip tulip = new Tulip("white", 35);
        Flower[] bouquet = {rose,rose,rose,tulip,tulip};
        int result = 0;
        for (int i = 0; i < bouquet.length; i++) {
           result += bouquet[i].getPrice();
        }
        System.out.println(result);
    }
}
