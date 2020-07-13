package IO;

import Utilties.ReceivedMoneySorter;
import Utilties.SentMoneySorter;
import com.company.Person;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Output {
    public static void biggestReceivers(HashMap<Integer, Person> people, Path path) {
        List<Person> sortedPeople = new ArrayList<>(people.values());
        sortedPeople.sort(new ReceivedMoneySorter());
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("id, vardas, pavarde, gauti pinigai, issiusti pinigai");
            writer.newLine();
            for (Person person : sortedPeople) {
                writer.write(person.getId() + ", " + person.getName() + ", " + person.getSurname() +
                        ", " + person.getReceivedMoney() + ", " + person.getSentMoney());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void biggestSenders(HashMap<Integer, Person> people, Path path) {
        List<Person> sortedPeople = new ArrayList<>(people.values());
        sortedPeople.sort(new SentMoneySorter());
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("id, vardas, pavarde, gauti pinigai, issiusti pinigai");
            writer.newLine();
            for (Person person : sortedPeople) {
                writer.write(person.getId() + ", " + person.getName() + ", " + person.getSurname() +
                        ", " + person.getReceivedMoney() + ", " + person.getSentMoney());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
