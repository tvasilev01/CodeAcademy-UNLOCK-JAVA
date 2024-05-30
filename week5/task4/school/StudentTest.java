package week5.task4.school;

import week5.task4.school.Student;

public class StudentTest {
    public static void main(String[] args) {
        /*
        В класа Student от задача Student направете следните промени:
        Добавете метод void increaseAge(), който увеличава възрастта на ученика с 1 година.
        Използвайте метод overloading, за да създадете метод void increaseAge(int years), който увеличава възрастта на ученика с years на брой години.
        Използвайте метод overloading, за да създадете метод void increaseAge(int years),
        който увеличава възрастта на ученика с years на брой години.
        Добавете и метод goToNextClass(); (Внимавайте! Класовете не се увеличават до безкрай! В даден момент ученикът ще завърши)
        В StudentTest класа демонстрирайте как работят методите, които добавихте.
         */
        Student student = new Student("Иван", "Иванов", 17, 11);

        System.out.println("Информация преди промените:");
        System.out.println("Име: " + student.getFirstName());
        System.out.println("Фамилия: " + student.getLastName());
        System.out.println("Възраст: " + student.getAge());
        System.out.println("Клас: " + student.getSchoolClass());


        student.increaseAge();
        System.out.println("\nИнформация след промените:");
        System.out.println("Име: " + student.getFirstName());
        System.out.println("Фамилия: " + student.getLastName());
        System.out.println("Възраст: " + student.getAge());
        student.goToNextClass();
    }
}
