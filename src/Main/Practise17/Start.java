package Main.Practise17;

import java.time.LocalDate;
import java.time.LocalTime;


public class Start {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(time.atDate(date));

    }
}
