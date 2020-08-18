package Utilities;

import Exceptions.NetworkException;

import java.util.Random;

public class NetworkConnector {
    public static void send(Object o) throws NetworkException {
        Random rand = new Random();
        int n = rand.nextInt(10);
        try {
            int i = 1 / n;
        } catch (ArithmeticException e) {
            throw new NetworkException("Network connection error");
        }
    }
}
