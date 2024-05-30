package week5.task5;

public class Student {
    private String name;
    private int age;
    private boolean isGraduated;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.isGraduated = false;
    }

    public int getAge() {
        return age;
    }

    public boolean isGraduated() {
        return isGraduated;
    }

    public void goToNextClass() {
        if (age >= 18) {
            System.out.println("Йееейй! Завърших!");
            isGraduated = true;
        }
    }

    @Override
    public String toString() {
        return "Ученик{" +
                "име='" + name + '\'' +
                ", години=" + age +
                ", isGraduated=" + isGraduated +
                '}';
    }
}
