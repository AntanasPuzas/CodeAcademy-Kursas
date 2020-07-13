package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Integer[] intArray = new Integer[] {1, 2, 3};
	    String[] stringArray = new String[] {"Hello", "world!"};

	    printArray(intArray);
	    printArray(stringArray);
    }

    private static <T> void printArray(T[] a) {
        for (T obj : a) {
            System.out.println(obj);
        }
    }
}
