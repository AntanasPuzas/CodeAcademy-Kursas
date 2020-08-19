package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class IO {
    public static HashMap<Integer, Person> readPeople(Path path) {
        HashMap<Integer, Person> people = new HashMap<>();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(", ");
                int id = Integer.parseInt(values[0].trim());
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

    public static void updatePeople(Path path, Map<Integer, Person> people) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(", ");
                //int id = Integer.parseInt(values[0]);
                double amount = Double.parseDouble(values[1].trim());
                int recipientId = Integer.parseInt(values[2].trim());
                int senderId = Integer.parseInt(values[3].trim());
                Person recipient = people.get(recipientId);
                recipient.addReceivedMoney(amount);
                people.put(recipientId, recipient);

                Person sender = people.get(senderId);
                sender.addSentMoney(amount);
                people.put(senderId, sender);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static <T extends Comparator> void sortedPeople(Path path, Map<Integer, Person> people, T sorter) {
        List<Person> sortedPeople = new ArrayList<>(people.values());
        sortedPeople.sort(sorter.reversed());
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("id, vardas, pavarde, gauti pinigai, issiusti pinigai");
            for (Person person : sortedPeople) {
                writer.write(person.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
