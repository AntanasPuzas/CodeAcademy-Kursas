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
        Output.sortedPeople(biggestReceiversPath, people, receivedMoneySorter);

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
        Output.sortedPeople(biggestSendersPath, people, sentMoneySorter);
    }
}
