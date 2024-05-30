package week8.task1.school;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        /*
            Създайте клас Student който има следните атрибути:
                -lastName
                -firstName
                -age
                -schoolClass
            Добавете конструктор който приема за аргумент всички атрибути
            Добавете get и set методи за всеки атрибут
            Напишете toString метод който принтира всички атрибути форматирани по ваш избор. (За форматирането е подходящо да се ползва StringBuilder)
            Създайте клас StudentTest в който се създават трима студенти, като инициализирате атрибути със стойности по ваш избор.
            За всеки Student принтирайте неговите toString метод.
            НЕ ЗАБРАВЯЙТЕ ДА ПОДРЕЖДАТЕ КЛАСОВЕТЕ В ПАКЕТИ
            В класът Student направете следните промени:
            Добавете метод void increaseAge() който увеличава възрастта на ученика с 1 година.
            Използвайте метод overloading за да създадете метод void increaseAge(int years) който увеличава възрастта на ученика с years на брой години.
            Добавете и метод goToNextClass(); (Внимавайте! Класовете не се увеличават до безкрай! В даден момент ученикът ще завърши) В StudentTest класа демонстрирайте как работят методите които добавихте.
         */
        Student ivanIvanov = new Student("Ivanov", "Ivan", 18, 12, 5.80);
        Student petarPetrov = new Student("Petrov", "Petar", 17, 11, 4.00);
        Student georgiGeorgiev = new Student("Georgiev", "Georgi", 18, 12, 2.50);

        System.out.println(ivanIvanov.toString());
        System.out.println(petarPetrov.toString());
        System.out.println(georgiGeorgiev.toString());

        System.out.println();
        ivanIvanov.increaseAge();
        System.out.println("After increase age: " + ivanIvanov.toString());

        System.out.println();
        petarPetrov.increaseAge(2);
        System.out.println("After increasing age by 2 years: " + petarPetrov.toString());

        System.out.println();
        georgiGeorgiev.goToNextClass();
        System.out.println("After going to the next class: " + georgiGeorgiev.toString());

        System.out.println();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivanov", "Ivan", 18, 12, 5.80));
        students.add(new Student("Petrov", "Petar", 17, 11, 4.00));
        students.add(new Student("Georgiev", "Georgi", 18, 12, 2.50));

        System.out.println("Excellent students:");
        for (Student student : students) {
            if (student.isExcellent()) {
                System.out.println(student.toString());
            }
        }

        System.out.println("\nVery bad students:");
        for (Student student : students) {
            if (student.isVeryBad()) {
                System.out.println(student.toString());
            }
        }

    }
}
