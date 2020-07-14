package com.company;

public class Main {

    public static void main(String[] args) {
        SuperPair<String, Double, Double> superPair = new SuperPair<String, Double, Double>
                ("Hello", 10.0, 12d);

        //SuperPair<Integer, Boolean, String> wrongPair = new SuperPair<Integer, Boolean, String>
        //        (1, true, "Hello");

        System.out.println(superPair);
    }
}
