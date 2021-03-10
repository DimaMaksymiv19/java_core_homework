package Main.Practise10;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String eMail;


    public Person() {

    }
    public Person(String name, int age, String eMail) {
        this.name = name;
        this.age = age;
        this.eMail = eMail;
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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public int compareTo(Person o) {
        int result = this.name.compareTo(o.getName());
        if(result == 0){
            if(this.age > o.getAge()){
                result = 1;
            }else if(this.age < o.getAge()){
                result = -1;
            }
        }if(result == 0){
            result = this.eMail.compareTo(eMail);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eMail='" + eMail + '\'' +
                ' ';
    }
}
