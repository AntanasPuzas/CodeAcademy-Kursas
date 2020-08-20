package com.company;

import java.util.ArrayList;
import java.util.Random;

public class X {
    ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

    public X() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(random.nextInt(10));
        }
    }

    public int sum() {
        int sum = 0;
        for (Integer integer : integerArrayList) {
            sum += integer;
        }
        return sum;
    }

    @Override
    public String toString() {
        return integerArrayList + " sum " + sum();
    }
}
