package com.company;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Y y = new Y(
                new X(),
                new X(),
                new X(),
                new X()
        );

        System.out.println(y);
        Collections.sort(y.getXList());
        System.out.println(y);
        Collections.reverse(y.getXList());
        System.out.println(y);
    }
}
