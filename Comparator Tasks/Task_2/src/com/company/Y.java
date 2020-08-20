package com.company;

import java.util.Arrays;
import java.util.List;

public class Y {
    private final List<X> xList;

    public Y(X...x) {
        xList = Arrays.asList(x);
    }

    public List<X> getXList() {
        return xList;
    }

    @Override
    public String toString() {
        return "Y{" +
                "xList=" + xList +
                '}';
    }
}
