package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class X implements Comparable<X> {
    private ArrayList<Integer> numbers = new ArrayList<>();

    public X() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            numbers.add(random.nextInt(3));
        }
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public int sum() {
        int sum = numbers.get(0);
        for (int x : numbers) {
            sum += x;
        }
        return sum;
    }

    @Override
    public int compareTo(X o1) {
        return this.sum() - o1.sum();
    }

    @Override
    public String toString() {
        return "X{" +
                "numbers=" + numbers +
                '}';
    }
}
