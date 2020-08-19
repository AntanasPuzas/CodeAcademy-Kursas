package com.company;

import java.util.Comparator;

public class SentMoneySorter implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSentMoney() < o2.getSentMoney()) {
            return -1;
        } else if (o1.getSentMoney() > o2.getSentMoney()) {
            return 1;
        } else {
            return 0;
        }
    }
}
