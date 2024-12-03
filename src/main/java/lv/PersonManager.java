package lv;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import lv.rvt.Person;

public class PersonManager {
    private ArrayList<Person> persons; 

    public PersonManager() {
        persons = new ArrayList<>(); 
    }

    public ArrayList<Person> getPersonList() throws IOException {
        // Assuming Helper.getReader returns a BufferedReader
        BufferedReader reader = Files.newBufferedReader(Paths.get("src/data/person.csv"));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");    
            Person person = new Person(data[0], (data[1]));
            persons.add(person);
        }
        
        reader.close(); 
        return persons;
    }

    public void addPerson(Person person) {
        if (person != null) {
            persons.add(person);
        }
    }
}

