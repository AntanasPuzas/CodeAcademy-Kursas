package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {
    public static JavaStudentGroup getStudents(Path path) {
        JavaStudentGroup students = new JavaStudentGroup();

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(", ");
                int id = Integer.parseInt(values[0].trim());
                String name = values[1].trim();
                String surname = values[2].trim();
                Student student = new Student(id, name, surname);
                students.addStudent(student);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return students;
    }
}
