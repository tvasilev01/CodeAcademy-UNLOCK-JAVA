package week1.topic4.tasks;

public class Task3_TableFormat {
    public static void main(String[] args) {

        /*
        Нека имате ученици със следните оценки: Иванчо – 2, Марийка – 6, Пенчо – 4, Голям Петко – 5.
        Използвайте printf да отпечатате оценките им в табличен вид, всеки ученик – на отделен ред.
        Нека дължината на колоната с имената е 20 символа, а колоната с оценките да е 2 символа.
        Имената са първи и са приравнени наляво. Втората колона с оценките е приравнена надясно.
         */

        String student1Name = "Иванчо";
        int student1Grade = 2;

        String student2Name = "Марийка";
        int student2Grade = 6;

        String student3Name = "Пенчо";
        int student3Grade = 4;

        String student4Name = "Голям Петко";
        int student4Grade = 5;

        String frame = ("------------------------------");
        String tab = "";
        System.out.println(frame);
        System.out.printf("|Ученик:%14s|Оценка:\n", tab);
        System.out.println(frame);
        System.out.printf("%-20s %2d%n", student1Name, student1Grade);
        System.out.printf("%-20s %2d%n", student2Name, student2Grade);
        System.out.printf("%-20s %2d%n", student3Name, student3Grade);
        System.out.printf("%-20s %2d%n", student4Name, student4Grade);
    }
}
