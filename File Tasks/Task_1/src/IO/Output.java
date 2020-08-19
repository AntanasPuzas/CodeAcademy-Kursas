package IO;

import com.company.Person;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Output {
    public static <T extends Comparator> void sortedPeople(Path path, Map<Integer, Person> people, T sorter) {
        List<Person> sortedPeople = new ArrayList<>(people.values());
        sortedPeople.sort(sorter.reversed());
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("id, vardas, pavarde, gauti pinigai, issiusti pinigai");
            writer.newLine();
            for (Person person : sortedPeople) {
                writer.write(person.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
