package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Y {
    ArrayList<X> xArrayList;

    public Y(ArrayList<X> xArrayList) {
        this.xArrayList = xArrayList;
    }

    public void sortXArrayList() {
        xArrayList.sort(new Sorter());
    }

    public void sortReverseXArrayList() {
        sortXArrayList();
        Collections.reverse(xArrayList);
    }

    @Override
    public String toString() {
        String output = "";
        for (X x : xArrayList) {
            output += x.toString() + " ";
        }
        return output;
    }
}
