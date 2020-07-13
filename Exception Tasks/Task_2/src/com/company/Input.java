package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public int returnInt() {
        System.out.println("Please input a number: ");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println(ex);
        }
        return -1;
    }
}
