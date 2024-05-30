package week8.task2;

import week8.task1.school.Student;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> classes;
    private List<Student> students;
    private static int numStudents = 0;

    public School(String name) {
        this.name = name;
        this.classes = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Integer> getClasses() {
        return classes;
    }

    public List<Student> getStudents() {
        return students;
    }

    public static void setNumStudents(int numStudents) {
        School.numStudents = numStudents;
    }

    public static int getNumberOfStudents() {
        return numStudents;
    }

    public void addStudent(Student student) {
        students.add(student);
        numStudents++;
    }
}
