package Main.Homework1;

public class Circle {
    float radius;
    float diameter;

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
        this.diameter = radius * 2;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public void area(){
        float result = 3.141f * ((diameter/2) * (diameter/2));
        System.out.println("Площа кола = " + result);
    }

    public void circleLength(){
        float result = 3.141f * 2 * radius;
        System.out.println("Довжина кола = " + result);
    }
}
