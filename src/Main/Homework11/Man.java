package Main.Homework11;

public class Man implements Comparable<Man>{

    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man: " +
                "name = '" + name + '\'' +
                ", age = " + age;
    }

    @Override
    public int compareTo(Man o) {
        int result = this.name.compareTo(o.getName());
        if(result == 0){
            if(this.age > o.getAge()){
                result = 1;
            }else if (this.age < o.getAge()){
                result = -1;
            }
        }
        return result;
    }
}
