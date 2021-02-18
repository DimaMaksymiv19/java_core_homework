package Main.Practise2;

public class Main {
    public static void main(String[] args) {
        Passanger numPas = new Passanger(3);
        Car car1 = new Car("red","sedan","mazda", numPas);
        Engine engine = new Engine("good");
        RegularCar regCar = new RegularCar("red", "desa","minicuper","FDD", engine);
        System.out.println(regCar.getType());

    }
}
