package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class JavaStudentGroup {
    ArrayList<Student> students = new ArrayList<>();

    public JavaStudentGroup(ArrayList<Student> students) {
        this.students = students;
    }

    public JavaStudentGroup() {
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public JavaStudentGroup sortStudents() {
        ArrayList<Student> sortedStudents = students;
        Collections.sort(sortedStudents);
        JavaStudentGroup sortedGroup = new JavaStudentGroup(sortedStudents);
        return sortedGroup;
    }

    public HashMap<Integer, JavaStudentGroup> splitIntoGroups(int numberOfGroups) {
        HashMap<Integer, JavaStudentGroup> studentGroups = new HashMap<>();
        int groupSize = students.size() / numberOfGroups;
        int beginning = 0;
        int counter = 0;
        for (int i = 1; i <= numberOfGroups; i++) {
            JavaStudentGroup group = new JavaStudentGroup();
            for (int j = beginning; j < counter + groupSize; j++) {
                group.addStudent(students.get(j));
                beginning++;
            }
            studentGroups.put(i, group);
            counter = beginning;
        }

        int amountOfLeftoverStudents = students.size() % numberOfGroups;
        if (amountOfLeftoverStudents != 0) {
            while (beginning < students.size()) {
                for (int i = 1; i <= amountOfLeftoverStudents; i++) {
                    studentGroups.get(i).addStudent(students.get(beginning));
                    beginning++;
                }
            }
        }
        return studentGroups;
    }
}
