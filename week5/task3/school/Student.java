package week5.task3.school;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String schoolClass;

    public Student(String firstName, String lastName, int age, String schoolClass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.schoolClass = schoolClass;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Име: ").append(firstName).append("\n");
        stringBuilder.append("Фамилия: ").append(lastName).append("\n");
        stringBuilder.append("Години: ").append(age).append("\n");
        stringBuilder.append("Клас: ").append(schoolClass).append("\n");

        return stringBuilder.toString();
    }
}
