package week8.task2;

import week8.task1.school.Student;

import java.util.Scanner;

public class SchoolTest {
    public static void main(String[] args) {
        /*
        Създайте клас School който има име, списък от класове, списък от ученици
        Добавете в класът Student константа която ще държи броя на учениците.
        Създайте класа SchoolTest в който ще се въвеждат от конзолата ученици.
        Когато приключи въвеждането (Вие преценете как да стане това. Може да ползвате същия начин като предишните задачи или нещо друго.) изведете в конзолата общия брой въведени ученици и toString-a на всеки от тях.
        Сега изведете всички които ще са абитуриенти.
        Извикайте goToNextClass() метода на всеки един от бъдещите абитуриенти. Нека той да принтира “Йееейй! Завърших!” Сега изведете в конзолата общия брой ученици? (Той променен ли е? Ако не е – оправете този бъг!)
         */
        Scanner scanner = new Scanner(System.in);
        School school = new School("My School");

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student #" + (i + 1));

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            System.out.print("Class: ");
            int schoolClass = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine(); // consume the newline character

            school.addStudent(new Student(lastName, firstName, age, schoolClass, gpa));
        }

        System.out.println("\nTotal number of entered students: " + School.getNumberOfStudents());

        System.out.println("\nDetails for each student:");
        for (Student student : school.getStudents()) {
            System.out.println(student.toString());
        }

        System.out.println("\nFuture graduates:");
        for (Student student : school.getStudents()) {
            if (student.getAge() == 19 && student.getSchoolClass() == 12) {
                System.out.println(student.toString());
                student.goToNextClass();
                System.out.println("Yeeey! I graduated!");
            }
        }

        System.out.println("\nTotal number of students after graduation: " + School.getNumberOfStudents());
    }
}
