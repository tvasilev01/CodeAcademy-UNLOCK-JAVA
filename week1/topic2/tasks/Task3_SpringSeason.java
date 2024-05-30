package week1.topic2.tasks;

import java.util.Scanner;

public class Task3_SpringSeason {
    public static void main(String[] args) {

                /*
        Напишете програма, в която дефинирате 2 int променливи – month & day.
        Програмата трябва да отпечатва true, ако денят е между 20-ти март (включително) и 20-ти юни (включително) и false,
        в противен случай.
        Нека:
        month = 4
        day = 31
        Проверихте ли внимателно какви са ви входните данни? Ами ако въведа ден 31 на месец, който няма 31 дни?
        Или пък въведа дата 40-ти май?
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете месец: ");
        int month = scanner.nextInt();
        System.out.println("Въведете ден: ");
        int day = scanner.nextInt();

        boolean isSpring = ((month == 3 && day >= 20 && day <= 31) ||
                ((month == 4 && day >= 1 && day <= 30) || (month == 5 && day >= 1 && day <= 31)) ||
                (month == 6 && day >= 1 && day <= 20))
                ? true
                : false;
        System.out.println("Пролет ли е ? - " + isSpring);




    }
}
