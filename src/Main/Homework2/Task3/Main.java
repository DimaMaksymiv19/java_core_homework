package Main.Homework2.Task3;

public class Main {
    public static void main(String[] args) {
        Animal leopard = new Animal("Leopard",30, 7);
        System.out.println("Animal name - " + leopard.getName() + " ,  Animal speed - " +
                leopard.getSpeed() + "km/h,  Animal age - " + leopard.getAge() + " years.");
        leopard.setAge(5);
        leopard.setName("Dog");
        leopard.setSpeed(15);
        System.out.println("Animal name - " + leopard.getName() + " ,  Animal speed - " +
                leopard.getSpeed() + "km/h,  Animal age - " + leopard.getAge() + " years.");


    }
}
