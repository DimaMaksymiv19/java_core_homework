package Main.Practise2;

public class Car {
    private String color;
    private String type;
    private String mark;
    private Passanger passanger;

    Car(){

    }

    public Car(String color, String type, String mark) {
        this.color = color;
        this.type = type;
        this.mark = mark;
    }

    public Car(String color, String type, String mark, Passanger passanger) {
        this.color = color;
        this.type = type;
        this.mark = mark;
        this.passanger = passanger;
    }


    public Passanger getPassanger() {
        return passanger;
    }

    public void setPassanger(Passanger passanger) {
        this.passanger = passanger;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
