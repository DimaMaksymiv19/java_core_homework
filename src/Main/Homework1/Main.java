package Main.Homework1;

public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(10, 5);
        Circle circle = new Circle(5);

        rec2.area();
        rec2.perimeter();
        System.out.println();
        circle.area();
        circle.circleLength();
    }
}
