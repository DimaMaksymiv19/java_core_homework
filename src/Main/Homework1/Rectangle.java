package Main.Homework1;

public class Rectangle {
    int length;
    int width;

    public Rectangle(){

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void area(){
        int result = width * length;
        System.out.println("Площа прямокутника = " + result);
    }

    public void perimeter(){
        int result = (2 * width) + (2 * length);
        System.out.println("Переметр прямокутника = " + result);
    }


}
