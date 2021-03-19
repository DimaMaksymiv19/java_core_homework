package Main.Homework13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Book theWither3 = new Book("The Wither: Elf's Blood","Anjey Sapkovwski", 318);
        Class classBook = theWither3.getClass();

        System.out.println("Task 1:");
        Method [] methodsBook = classBook.getDeclaredMethods();
        System.out.println(Arrays.toString(methodsBook));

        System.out.println("Task 2:");
        Field [] fieldsBook = classBook.getDeclaredFields();
        System.out.println(Arrays.toString(fieldsBook));

        System.out.println("Task 3:");
        Constructor [] constructorsBook = classBook.getDeclaredConstructors();
        System.out.println(Arrays.toString(constructorsBook));

        System.out.println("Task 4:");
        Book newBook1 = (Book) constructorsBook[0].newInstance();
        Book newBook2 = (Book) constructorsBook[1].newInstance("fs","ds", 10);
        System.out.println(newBook1.toString());
        System.out.println(newBook2.toString());

        System.out.println("Task 5:");
        Method addPagesBook = classBook.getDeclaredMethod("addPages", int.class);
        addPagesBook.setAccessible(true);
        addPagesBook.invoke(theWither3 ,100);
        System.out.println(theWither3.getNumPages());

        Method toStringBook = classBook.getMethod("toString");
        System.out.println(toStringBook.invoke(theWither3));
    }
}
