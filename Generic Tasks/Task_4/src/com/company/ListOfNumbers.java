package com.company;

import java.util.ArrayList;

public class ListOfNumbers {
    ArrayList<Double> list = new ArrayList<>();

    public void addNumber(double value) {
        list.add(value);
    }

    public double getAverage() {
        double sum = 0;
        for (double val : list) {
            sum += val;
        }
        return sum / list.size();
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "list=" + list +
                '}';
    }
}
