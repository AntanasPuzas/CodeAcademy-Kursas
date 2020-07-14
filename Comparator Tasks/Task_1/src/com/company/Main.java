package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Puzas\\Desktop\\CodeAcademy-Kursas\\people.txt");
        JavaStudentGroup students = FileReader.getStudents(path);
        JavaStudentGroup sortedStudents = students.sortStudents();
        HashMap<Integer, JavaStudentGroup> groupedStudents = sortedStudents
                .splitIntoGroups(4);
    }
}
