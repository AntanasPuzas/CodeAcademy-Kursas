package com.company;

public class SuperPair <T1, T2, T3 extends Number> {
    private T1 t1;
    private T2 t2;
    private T3 number;

    public SuperPair(T1 t1, T2 t2, T3 number) {
        this.t1 = t1;
        this.t2 = t2;
        this.number = number;
    }

    @Override
    public String toString() {
        return "SuperPair{" +
                "t1=" + t1 +
                ", t2=" + t2 +
                ", number=" + number +
                '}';
    }
}
