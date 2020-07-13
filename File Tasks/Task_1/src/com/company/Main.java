package com.company;

import IO.Input;
import IO.Output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        Input input = new Input();
        Path peoplePath = Paths.get("C:\\Users\\Puzas\\Desktop\\CodeAcademy-Kursas\\File Tasks\\" +
                "Task_1\\people.txt");
        Path paymentPath = Paths.get("C:\\Users\\Puzas\\Desktop\\CodeAcademy-Kursas\\File Tasks\\" +
                "Task_1\\payment.txt");
        HashMap<Integer, Person> people = input.getPeople(peoplePath);
        //HashMap<Integer, Person> updatedPeople = input.updatePayments(paymentPath, people);
        Input.updatePayments(paymentPath, people);

        Path biggestReceiversPath;
        try {
            biggestReceiversPath = Files.createFile(Paths.get("C:\\Users\\Puzas\\Desktop\\" +
                    "CodeAcademy-Kursas\\File Tasks\\Task_1\\biggestReceiversSorted.txt"));
        } catch (IOException ex) {
            Files.delete(Paths.get("C:\\Users\\Puzas\\Desktop\\" +
                    "CodeAcademy-Kursas\\File Tasks\\Task_1\\biggestReceiversSorted.txt"));
            biggestReceiversPath = Files.createFile((Paths.get("C:\\Users\\Puzas\\Desktop\\" +
                    "CodeAcademy-Kursas\\File Tasks\\Task_1\\biggestReceiversSorted.txt")));
        }
        Output.biggestReceivers(people, biggestReceiversPath);
        Path biggestSendersPath;
        try {
            biggestSendersPath = Files.createFile(Paths.get("C:\\Users\\Puzas\\Desktop\\" +
                    "CodeAcademy-Kursas\\File Tasks\\Task_1\\biggestSendersSorted.txt"));
        } catch (IOException ex) {
            Files.delete(Paths.get("C:\\Users\\Puzas\\Desktop\\" +
                    "CodeAcademy-Kursas\\File Tasks\\Task_1\\biggestSendersSorted.txt"));
            biggestSendersPath = Files.createFile((Paths.get("C:\\Users\\Puzas\\Desktop\\" +
                    "CodeAcademy-Kursas\\File Tasks\\Task_1\\biggestSendersSorted.txt")));
        }
        Output.biggestSenders(people, biggestSendersPath);
    }
}
