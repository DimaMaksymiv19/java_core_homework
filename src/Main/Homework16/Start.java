package Main.Homework16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args)
    {
        Employee employee = new Employee("Mark",1111,2500);
        Employee employee3 = new Employee("Bill",3333,21500);
        Employee employee2 = new Employee("Roman",2222,1500);
        String currentDir = System.getProperty("user.dir");
        Employee employee1;
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee3);
        employeeList.add(employee2);
        List<Employee> employeeList1Deserialisation = new ArrayList<>();

        try (OutputStream fileOutputStream = new FileOutputStream(currentDir + "\\src\\Main\\Homework16\\Employee.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
        {
            for (Employee el : employeeList)
            {
                objectOutputStream.writeObject(el);
            }
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }



        try(InputStream fileInputStream = new FileInputStream(currentDir + "\\src\\Main\\Homework16\\Employee.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
        {

            employee3 = (Employee) objectInputStream.readObject();
            employee2 = (Employee) objectInputStream.readObject();
            employee1 = (Employee) objectInputStream.readObject();
            System.out.println(employee1);
            System.out.println(employee2);
            System.out.println(employee3);
        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println(e.getMessage());

        }


    }
}
