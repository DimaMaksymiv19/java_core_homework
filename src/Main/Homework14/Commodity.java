package Main.Homework14;

public class Commodity implements Comparable<Commodity>{
    private String name;
    private float len;
    private float width;
    private float weight;

    public Commodity(String name, float len, float width, float weight) {
        this.name = name;
        this.len = len;
        this.width = width;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLen() {
        return len;
    }

    public void setLen(float len) {
        this.len = len;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Commodity: " +
                "Name='" + name + '\'' +
                ", Length=" + len +
                ", Width=" + width +
                ", Weight=" + weight;
    }

    @Override
    public int compareTo(Commodity o) {
        int result = this.name.compareTo(o.getName());
        return result;
    }
}
