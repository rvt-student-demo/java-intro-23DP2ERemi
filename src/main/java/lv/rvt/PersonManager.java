package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class PersonManager {
    public static ArrayList<Person> getPersonList() throws Exception {
        ArrayList<Person> persons = new ArrayList<>();
        BufferedReader reader = Helper.getReader("person.csv");

        reader.readLine(); 
        String line;

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",\\s*");
            Person person1 = new Person(data[0], Integer.valueOf(data[1]), Integer.valueOf(data[2]), Integer.valueOf(data[3]));
            persons.add(person1);
        }
        reader.close();
        return persons;
    }

    public static void addPerson(Person person) throws Exception {
        BufferedWriter writer = Helper.getWriter("person.csv", StandardOpenOption.APPEND);
        writer.write(person.toCsvRow());
        writer.newLine();
        writer.close();
    }
}
