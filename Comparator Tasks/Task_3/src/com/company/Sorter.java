package com.company;

import java.util.Comparator;

public class Sorter implements Comparator<ErrorLevels> {
    @Override
    public int compare(ErrorLevels o1, ErrorLevels o2) {
        return o1.compareTo(o2);
    }
}
