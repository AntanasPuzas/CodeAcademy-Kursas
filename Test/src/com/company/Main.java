package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Path initialPeople = Paths.get("C:\\Users\\Puzas\\Desktop\\CodeAcademy-Kursas\\" +
                "Test\\people.txt");
        Path initialPayments = Paths.get("C:\\Users\\Puzas\\Desktop\\CodeAcademy-Kursas\\" +
                "Test\\payment.txt");

        Map<Integer, Person> initialPeopleMap = IO.readPeople(initialPeople);
        IO.updatePeople(initialPayments, initialPeopleMap);

        Path biggestReceiversPath;
        String biggestReceiversString = "C:\\Users\\Puzas\\Desktop\\CodeAcademy-Kursas\\" +
                "Test\\biggestReceivers.txt";
        try {
            biggestReceiversPath = Files.createFile(Paths.get(biggestReceiversString));
        } catch (IOException ex) {
            Files.delete(Paths.get(biggestReceiversString));
            biggestReceiversPath = Files.createFile(Paths.get(biggestReceiversString));
        }

        ReceivedMoneySorter receivedMoneySorter = new ReceivedMoneySorter();
        IO.sortedPeople(biggestReceiversPath, initialPeopleMap, receivedMoneySorter);

        Path biggestSendersPath;
        String biggestSendersString = "C:\\Users\\Puzas\\Desktop\\CodeAcademy-Kursas\\" +
                "Test\\biggestSenders.txt";
        try {
            biggestSendersPath = Files.createFile(Paths.get(biggestSendersString));
        } catch (IOException ex) {
            Files.delete(Paths.get(biggestSendersString));
            biggestSendersPath = Files.createFile(Paths.get(biggestSendersString));
        }

        SentMoneySorter sentMoneySorter = new SentMoneySorter();
        IO.sortedPeople(biggestSendersPath, initialPeopleMap, sentMoneySorter);
    }
}
