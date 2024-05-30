package week5.task4.school;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int schoolClass;

    public Student(String firstName, String lastName, int age, int schoolClass) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (age >= 7) {
            this.age = age;
        } else {
            System.out.println("Невалидна възраст.");
            this.age = 0;
        }

        if (schoolClass >= 1 && schoolClass <= 12) {
            this.schoolClass = schoolClass;
        } else {
            System.out.println("Невалиден клас.");
            this.schoolClass = 1;
        }
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

    public int getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(int schoolClass) {
        this.schoolClass = schoolClass;
    }

    public void increaseAge() {
        if (age >= 7 && age <= 19) {
            age++;
        } else {
            System.out.println("Ученикът е на възраст 19 години и не може да бъде увеличена");
        }
    }

    public void increaseAge(int years) {
        if (age + years <= 19) {
            age += years;
        } else {
            System.out.println("Увеличението на възрастта с " + years + " години надвишава максималната възможна възраст (19 години).");
        }
    }

    public void goToNextClass() {
        if (schoolClass < 12) {
            schoolClass++;
            System.out.println(firstName + " премина в " + schoolClass + " клас.");
        } else {
            System.out.println(firstName + " вече завърши всички класове.");
        }
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
