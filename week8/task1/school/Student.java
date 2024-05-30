package week8.task1.school;

import week8.task2.School;

public class Student {
    private String lastName;
    private String firstName;
    private int age;
    private int schoolClass;
    private double gradePointAverage;

    public Student(String lastName, String firstName, int age, int schoolClass, double gradePointAverage) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.schoolClass = schoolClass;
        this.gradePointAverage = gradePointAverage;
    }

    public double getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(int schoolClass) {
        this.schoolClass = schoolClass;
    }

    public boolean isExcellent(){
        return  gradePointAverage >= 5.50;
    }

    public boolean isVeryBad(){
        return  gradePointAverage < 3.00;
    }

    public void increaseAge() {
        age++;
    }

    public void increaseAge(int years) {
        age += years;
    }

    public void goToNextClass() {
        int currentClass = schoolClass;

        if (currentClass < 12) {
            currentClass++;
            increaseAge();
            schoolClass = currentClass;
            System.out.println("The student has moved to class: " + schoolClass);
        } else {
            increaseAge();
            schoolClass = 12;
            System.out.println("The student has completed the highest class.");
            int currentNumStudents = School.getNumberOfStudents();
            School.setNumStudents(currentNumStudents - 1);
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(Student) ");
        sb.append("Name: ").append(getFirstName()).append(" ").append(getLastName());
        sb.append(", Age: ").append(getAge());
        sb.append(", Class: ").append(getSchoolClass());
        sb.append(", Grade Point Average: ").append(getGradePointAverage());
        return sb.toString();
    }
}
