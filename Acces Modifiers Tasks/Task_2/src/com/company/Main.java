package com.company;

import ScuffedValidator.PVMValidatorEdited;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input PVM code: ");
        String[] stringDigits = scanner.nextLine().split("(?<=.)");
        if (stringDigits.length != 9) {
            throw new IndexOutOfBoundsException("You must input 8 numbers");
        }
        int[] digits = new int[stringDigits.length];
        for (int i = 0; i < stringDigits.length; i++) {
            digits[i] += Integer.parseInt(stringDigits[i]);
        }

        PVMValidator validator = new PVMValidatorEdited();
        PVMValidatorEdited validatorEdited = new PVMValidatorEdited();
        System.out.println(validator.validatePVM(digits));
        System.out.println(validatorEdited.validatePVM(digits));
    }
}
