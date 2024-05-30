package week5.task5;

import java.util.Scanner;

public class SchoolTest {
    public static void main(String[] args) {
        /*
        Създайте клас School, който има име, списък от класове, списък от ученици.
        Добавете в класа Student от предишната задача константа, която ще държи броя на учениците.
        Създайте класа SchoolTest, в който ще се въвеждат от конзолата ученици.
        Когато приключи въвеждането (Вие преценете как да стане това.
        Може да ползвате същия начин като предишните задачи или нещо друго.), изведете в конзолата общия брой въведени ученици и toString-a на всеки от тях.
        Сега изведете всички, които ще са абитуриенти.
        Извикайте goToNextClass() метода на всеки един от бъдещите абитуриенти. Нека той да принтира “Йееейй! Завърших!”
        Сега изведете в конзолата общия брой ученици (Той променен ли е? Ако не е – оправете този бъг!)
         */
        Scanner scanner = new Scanner(System.in);

        School school = new School("My School");

        System.out.println("Въведете броя на учениците: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Въведете данни за ученика (име, възраст): ");
            String name = scanner.next();
            int age = scanner.nextInt();
            scanner.nextLine();

            Student student = new Student(name, age);
            school.addStudents(student);
        }

        System.out.println();
        System.out.println("Общ брой ученици: " + school.getStudents().size());

        System.out.println();
        System.out.println("Списък на всички ученици: ");
        for (Student student : school.getStudents()) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("Списък на всички ученици след завършване: ");
        for (Student student : school.getStudents()) {
            System.out.println(student);
            if (student.getAge() >= 18) {
                student.goToNextClass();
            } else {
                System.out.println("Ученикът трябва да е на 18 или повече години за да завърши.");
            }
        }

        System.out.println();
        System.out.println("Списък на всички завършили студенти: ");
        for (Student student : school.getStudents()) {
            if (student.isGraduated()) {
                System.out.println(student);
            }
        }
    }
}
