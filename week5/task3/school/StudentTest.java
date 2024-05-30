package week5.task3.school;

import week5.task3.school.Student;

public class StudentTest {
    public static void main(String[] args) {
        /*
           Създайте клас Student който има следните атрибути:
                -lastName
                -firstName
                -age
                -schoolClass
            Добавете конструктор, който приема за аргумент всички атрибути.
            Добавете get и set методи за всеки атрибут.
            Напишете toString метод, който принтира всички атрибути, форматирани по ваш избор. (За форматирането е подходящо да се ползва StringBuilder)
            Създайте клас StudentTest, в който се създават трима студенти, като инициализирате атрибути със стойности по ваш избор.
            За всеки Student принтирайте неговите toString методи.
            НЕ ЗАБРАВЯЙТЕ ДА ПОДРЕЖДАТЕ КЛАСОВЕТЕ В ПАКЕТИ.
         */
        Student firstStudent = new Student("Иван", "Иванов", 14, "7A");
        Student secondStudent = new Student("Георги", "Герогиев", 18, "12В");
        Student thirdStudent = new Student("Калина", "Иванова", 17, "11Б");

        System.out.println("Студент 1:\n" + firstStudent.toString());
        System.out.println("Студент 2:\n" + secondStudent.toString());
        System.out.println("Студент 3:\n" + thirdStudent.toString());
    }
}
