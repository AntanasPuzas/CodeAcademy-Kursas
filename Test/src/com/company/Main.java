package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<X> xArrayList = new ArrayList<X>() {
            {
                add(new X());
                add(new X());
                add(new X());
            }
        };
        Y y = new Y(xArrayList);
        System.out.println(y.toString());
        y.sortXArrayList();
        System.out.println(y.toString());
        y.sortReverseXArrayList();
        System.out.println(y.toString());
    }
}