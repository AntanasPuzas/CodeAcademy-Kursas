package com.company;

public class Student implements Comparable<Student> {
    private Integer id;
    private String name;
    private String surname;

    public Student(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Student() {}

    public Integer getId() {
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

    @Override
    public int compareTo(Student o) {
        int i = this.getName().compareTo(o.getName());
        if (i != 0) {
            return i;
        }

        int j = this.getSurname().compareTo(o.getSurname());
        if (j != 0) {
            return j;
        }
        return this.getId() - o.getId();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
