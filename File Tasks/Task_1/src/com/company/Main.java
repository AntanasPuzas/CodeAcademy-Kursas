package com.company;

import IO.Input;
import IO.Output;
import Utilties.ReceivedMoneySorter;
import Utilties.SentMoneySorter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        Path peoplePath = Paths.get("C:\\Users\\Puzas\\Desktop\\CodeAcademy-Kursas\\File Tasks\\" +
                "Task_1\\people.txt");
        Path paymentPath = Paths.get("C:\\Users\\Puzas\\Desktop\\CodeAcademy-Kursas\\File Tasks\\" +
                "Task_1\\payment.txt");
        HashMap<Integer, Person> people = Input.getPeople(peoplePath);
        Input.updatePayments(paymentPath, people);

        Path biggestReceiversPath = Paths.get("C:\\Users\\Puzas\\Desktop\\CodeAcademy-Kursas\\" +
                "Test\\biggestReceivers.txt");
        try {
            Files.createFile(biggestReceiversPath);
        } catch (IOException ex) {
            Files.delete(biggestReceiversPath);
            Files.createFile(biggestReceiversPath);
        }
        ReceivedMoneySorter receivedMoneySorter = new ReceivedMoneySorter();
        Output.sortedPeople(biggestReceiversPath, people, receivedMoneySorter);

        Path biggestSendersPath = Paths.get("C:\\Users\\Puzas\\Desktop\\CodeAcademy-Kursas\\" +
                "Test\\biggestSenders.txt");

        try {
            Files.createFile(biggestSendersPath);
        } catch (IOException ex) {
            Files.delete(biggestSendersPath);
            Files.createFile(biggestSendersPath);
        }
        SentMoneySorter sentMoneySorter = new SentMoneySorter();
        Output.sortedPeople(biggestSendersPath, people, sentMoneySorter);
    }
}
