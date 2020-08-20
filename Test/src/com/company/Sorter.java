package com.company;

import java.util.Comparator;

public class Sorter implements Comparator<X> {
    @Override
    public int compare(X o1, X o2) {
        return o1.sum() - o2.sum();
    }
}
