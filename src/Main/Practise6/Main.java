package Main.Practise6;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter your name");
            String name = scan.next();

            System.out.println("Enter you age");
            int age = scan.nextInt();

            if (age < 18) {
                throw new UnderAgeException("Age is under 18");
            }
            System.out.println("Enter your email");
            String email = scan.next();
            if (!email.contains("@")) {
                throw new IncorrectEmailException("Email is incorrect");

            }

            Person man = new Person(name, age, email);
            System.out.println("Complete");
        }catch (UnderAgeException e){
            System.out.println(e.getMessage());

        }catch (IncorrectEmailException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thanks");
        }
    }

}
