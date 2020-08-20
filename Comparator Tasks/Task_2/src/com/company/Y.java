package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Y {
    private List<X> xList = new ArrayList<>();

    public Y(List<X> xList) {
        this.xList = xList;
    }

    public Y(X...x) {
        xList = Arrays.asList(x);
    }

    public Y() {
    }

    public List<X> getxList() {
        return xList;
    }

    @Override
    public String toString() {
        return "Y{" +
                "xList=" + xList +
                '}';
    }
}
