package com.company;

import java.util.Comparator;

public class ReceivedMoneySorter implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getReceivedMoney() < o2.getReceivedMoney()) {
            return -1;
        } else if (o1.getReceivedMoney() > o2.getReceivedMoney()) {
            return 1;
        } else {
            return 0;
        }
    }
}
