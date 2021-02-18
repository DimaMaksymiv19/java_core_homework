package Main.Homework2.Task2;

public class Wheel {
    private int size;
    private String rubberType;

    public Wheel(int size, String rubberType) {
        this.size = size;
        this.rubberType = rubberType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getRubberType() {
        return rubberType;
    }

    public void setRubberType(String rubberType) {
        this.rubberType = rubberType;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", rubberType='" + rubberType + '\'' +
                '}';
    }
    public int sizePlusOne(){
        size += 1;
        return size;
    }
}
