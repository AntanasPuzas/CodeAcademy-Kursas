package com.company;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new X();
        X x3 = new X();
        X x4 = new X();

        Y y = new Y(x1, x2, x3, x4);
        System.out.println(y);
        Collections.sort(y.getxList());
        System.out.println(y);
        Collections.reverse(y.getxList());
        System.out.println(y);
    }
}
