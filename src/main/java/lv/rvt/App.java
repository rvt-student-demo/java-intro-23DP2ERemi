package lv.rvt;



import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run){
            System.out.print("Enter command (show, add, help, exit): ");
            String command = scanner.nextLine().trim().toLowerCase();

            if (command.equals("show")) {
                ArrayList<Person> persons = PersonManager.getPersonList();
                for (Person p : persons) {
                    System.out.println(p);
                }
            } else if (command.equals("add")) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter age: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter weight: ");
                int weight = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter height: ");
                int height = Integer.parseInt(scanner.nextLine());
                Person person = new Person(name, age, weight, height);
                PersonManager.addPerson(person);
                System.out.println("Person added successfully.");
            } else if (command.equals("help")) {
                System.out.println("Available commands:");
                System.out.println("show - Display all persons from the CSV file");
                System.out.println("add - Add a new person to the CSV file");
                System.out.println("help - Show available commands");
                System.out.println("exit - Exit the program");
            } else if (command.equals("exit")) {
                System.out.println("Thanks, bye bye!");
                running = false;
            } else {
                System.out.println("Invalid command. Type 'help' for a list of commands.");
            }
        }

        scanner.close();
    }
}
