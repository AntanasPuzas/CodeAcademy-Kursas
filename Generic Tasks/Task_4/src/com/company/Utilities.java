package com.company;

public class Utilities {
    public static ListOfNumbers findWithMaxAverage(ListOfNumbers... list) {
        double maxAverage = list[0].getAverage();
        ListOfNumbers maxAverageList = list[0];
        for (ListOfNumbers value : list) {
            if (value.getAverage() > maxAverage) {
                maxAverage = value.getAverage();
                maxAverageList = value;
            }
        }
        return maxAverageList;
    }
}
