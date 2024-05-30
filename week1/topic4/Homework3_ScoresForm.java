package week1.topic4;

public class Homework3_ScoresForm {
    public static void main(String[] args) {

        /*
        Нека имате ученици със следните оценки: Иванчо - 2, Марийка - 6, Пенчо - 4, Голям Петко - 5.
        Използвайте printf да отпечатате оценките им в табличен вид, всеки ученик - на отделен ред.
         */

        String student1Name = "Иванчо";
        int student1Grade = 2;

        String student2Name = "Марийка";
        int student2Grade = 6;

        String student3Name = "Пенчо";
        int student3Grade = 4;

        String student4Name = "Голям Петко";
        int student4Grade = 5;

        String frame = ("--------------------");
        System.out.println(frame);
        System.out.println("|Ученик:\t|Оценка:");
        System.out.println(frame);
        System.out.printf("%s\t%8d%n", student1Name, student1Grade);
        System.out.printf("%s\t%8d%n", student2Name, student2Grade);
        System.out.printf("%s\t%8d%n", student3Name, student3Grade);
        System.out.printf("%s\t%4d%n", student4Name, student4Grade);
    }
}
