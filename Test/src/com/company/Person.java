package com.company;

public class Person {
    private int id;
    private String name;
    private String surname;
    private double receivedMoney;
    private double sentMoney;

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Person(int id, String name, String surname, double receivedMoney, double sentMoney) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.receivedMoney = receivedMoney;
        this.sentMoney = sentMoney;
    }

    public Person() {
    }

    public void addReceivedMoney(double amount) {
        receivedMoney += amount;
    }

    public void addSentMoney(double amount) {
        sentMoney += amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getReceivedMoney() {
        return receivedMoney;
    }

    public void setReceivedMoney(double receivedMoney) {
        this.receivedMoney = receivedMoney;
    }

    public double getSentMoney() {
        return sentMoney;
    }

    public void setSentMoney(double sentMoney) {
        this.sentMoney = sentMoney;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + surname + ", " + receivedMoney + ", " + sentMoney;
    }
}
