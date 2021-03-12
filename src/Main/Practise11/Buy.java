package Main.Practise11;

public class Buy implements Comparable<Buy>{
    private String name;
    private int number;

    public Buy(String name, int number) {
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

    @Override
    public String toString() {
        return  "Name = " + name + '\'' +
                ", number=" + number;
    }

    @Override
    public int compareTo(Buy o) {
        int result = this.name.compareTo(o.getName());
        return result;
    }
}
