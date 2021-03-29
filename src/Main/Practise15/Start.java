package Main.Practise15;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        StringBuilder data = new StringBuilder();
        String currentDir = System.getProperty("user.dir");
        try (InputStream inputStream = new FileInputStream(currentDir +"\\src\\Main\\Practise15\\file.txt")) {

            while (inputStream.available() > 0) {
                data.append((char) inputStream.read());
            }
            System.out.println(data);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        for (String line: data.toString().split("\n")){
            String[] elem = line.split(",");
            Person person = new Person(elem[0], Integer.parseInt(elem[1].trim()));
            people.add(person);
        }
        System.out.println(people.toString());


    }

}
