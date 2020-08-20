package com.company;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class X implements Comparable<X> {
    private final List<Integer> numbers;

    public X() {
        Random random = new Random();
        numbers = random.ints(3, 0, 3)
                .boxed()
                .collect(Collectors.toList());
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int sum() {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
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
