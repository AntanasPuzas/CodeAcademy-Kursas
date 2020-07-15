package com.company;

public class Counter {
    static String n;

    public Counter() {
        this.n = "0";
    }

    protected void increment() {
        Integer number = Integer.parseInt(n);
        number++;
        n = number.toString();
    }

    protected void reset() {
        this.n = "0";
    }
}
