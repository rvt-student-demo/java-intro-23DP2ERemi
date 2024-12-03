package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;
import lv.PersonManager; 
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException, Exception { 

        Scanner scanner = new Scanner(System.in);

        System.out.println("name:");
        String name = scanner.nextLine();
        System.out.println("age:");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        Person person = new Person(name, age);
        PersonManager.addPerson(person);
        System.out.println("Thank you for registering");

        ArrayList<Person> persons = PersonManager.getPersonList(); 
        for (Person p : persons) {
            System.out.println(p);
        }

        scanner.close();
    }
}
