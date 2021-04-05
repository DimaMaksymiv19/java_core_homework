package Main.Homewok18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass("something", 5);
        Class classSomeClass = someClass.getClass();
        Field [] fields = classSomeClass.getDeclaredFields();

        for(Field field : fields){
            if (field.isAnnotationPresent(SomeAnnotation.class)){
                try(OutputStream fileOutputStream = new FileOutputStream("C:\\Users\\dimam\\IdeaProjects\\core_java_homework\\src\\Main\\Homewok18\\Fields.txt");
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
                {
                    System.out.println(0);
                    objectOutputStream.writeObject(someClass);
                    System.out.println(1);
                }
                catch (IOException e)
                {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
