package Main.Homework2.Task2;

public class Car {
    private String brand;
    private Helm helm;
    private Wheel wheel;
    private Body body;

    public Car(String brand, Helm helm, Wheel wheel, Body body) {
        this.brand = brand;
        this.helm = helm;
        this.wheel = wheel;
        this.body = body;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", helm=" + helm +
                ", wheel=" + wheel +
                ", body=" + body +
                '}';
    }
    public int plusWheelSize(int plusSize){
        int wheelSize = wheel.getSize() + plusSize;
        wheel.setSize(wheelSize);
        return wheelSize;
    }
}
