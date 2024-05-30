package week5.task5;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
