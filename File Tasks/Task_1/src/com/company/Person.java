package com.company;

public class Person{
    int id;
    String name;
    String surname;
    int receivedMoney;
    int sentMoney;

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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

    public int getId() {
        return id;
    }

    public int getReceivedMoney() {
        return receivedMoney;
    }

    public void setReceivedMoney(int receivedMoney) {
        this.receivedMoney = receivedMoney;
    }

    public void addReceivedMoney(int receivedMoney) {
        this.receivedMoney += receivedMoney;
    }

    public int getSentMoney() {
        return sentMoney;
    }

    public void setSentMoney(int sentMoney) {
        this.sentMoney = sentMoney;
    }

    public void addSentMoney(int sentMoney) {
        this.sentMoney += sentMoney;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", receivedMoney=" + receivedMoney +
                ", sentMoney=" + sentMoney +
                '}';
    }
}
