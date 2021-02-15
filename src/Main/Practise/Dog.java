package Main.Practise;

public class Dog {
    String name;
    String type;
    int age;
    String owner;
    String color;

    public Dog(){

    }

    public Dog(String name, String type, int age, String color) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.color = color;
    }

    public Dog(String name, String type, int age, String owner, String color) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.owner = owner;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    boolean hasHome(){
        return owner != null && !owner.isEmpty();
    }
    public void Voice(){
        System.out.println("Gav-gav-gav...");
    }
    boolean isOld(){
        if (age >= 8){
            return true;
        }else {
            return false;
        }
    }

}
