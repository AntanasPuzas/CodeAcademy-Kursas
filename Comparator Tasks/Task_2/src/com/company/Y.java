package com.company;

import java.util.ArrayList;

public class Y {
    private ArrayList<X> xList = new ArrayList<>();

    public Y(ArrayList<X> xList) {
        this.xList = xList;
    }

    public Y(X...x) {
        for (X val : x) {
            xList.add(val);
        }
    }

    public Y() {
    }

    public ArrayList<X> getxList() {
        return xList;
    }

    @Override
    public String toString() {
        return "Y{" +
                "xList=" + xList +
                '}';
    }
}
