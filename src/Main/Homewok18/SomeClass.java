package Main.Homewok18;

public class SomeClass {
    @SomeAnnotation("+")
    public String name;
    @SomeAnnotation("+")
    public int number;

    public SomeClass(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
