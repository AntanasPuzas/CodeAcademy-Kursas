package IO;

import com.company.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Input {
    public HashMap getPeople(Path path) {
        HashMap<Integer, Person> people = new HashMap<>();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(", ");
                int id = Integer.parseInt(values[0]);
                String name = values[1].trim();
                String surname = values[2].trim();
                Person person = new Person(id, name, surname);
                people.put(id, person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }

    public static void updatePayments(Path path, HashMap<Integer, Person> people) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = reader.readLine();
             while ((line = reader.readLine()) != null) {
                 String[] values = line.split(", ");
                 int id = Integer.parseInt(values[0].trim());
                 int money = Integer.parseInt(values[1].trim());
                 int recipientId = Integer.parseInt(values[2].trim());
                 int senderId = Integer.parseInt(values[3].trim());
                 Person recipient = people.get(recipientId);
                 recipient.addReceivedMoney(money);
                 people.put(recipientId, recipient);
                 Person sender = people.get(senderId);
                 sender.addSentMoney(money);
                 people.put(senderId, sender);
             }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
