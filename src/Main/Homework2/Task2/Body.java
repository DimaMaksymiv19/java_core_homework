package Main.Homework2.Task2;

public class Body {
    private String color;
    private String type;
    private int weight;

    public Body(String color, String type, int weight) {
        this.color = color;
        this.type = type;
        this.weight = weight;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Body{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
    public int weigthMinusOneHundret(){
        weight -= 100;
        return weight;
    }
}
