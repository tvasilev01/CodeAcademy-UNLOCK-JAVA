package week1.topic2;

import java.util.Scanner;

public class Homework3_SpringSeason {
    public static void main(String[] args) {
        /*
        Напишете програма SpringSeason, в която дефинирате 2 int променливи - month & day.
        Програмата трябва да отпечатва true ако денят е между 20ти Март (включително) и 20ти Юни
        (включително) и false в противен случай.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете месец: ");
        int month = scanner.nextInt();
        System.out.println("Въведете ден: ");
        int day = scanner.nextInt();

        boolean isSpring = ((month == 3 && day >= 20) ||
                ((month == 4) || (month == 5)) ||
                (month == 6 && day <= 20))
                ? true
                : false;
        System.out.println("Пролет ли е ? - " + isSpring);


    }
}

