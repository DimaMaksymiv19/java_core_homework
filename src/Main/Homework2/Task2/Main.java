package Main.Homework2.Task2;

public class Main {
    public static void main(String[] args) {
        Helm smallHelm = new Helm(5,"leather");
        Wheel standartWheel = new Wheel(14,"winter");
        Body typicalBody = new Body("red","sedan", 2000);
        Car mainCar = new Car("mersedes",smallHelm,standartWheel,typicalBody);
        System.out.println(mainCar.toString());
        mainCar.plusWheelSize(10);
        System.out.println(mainCar.getWheel());




    }
}
