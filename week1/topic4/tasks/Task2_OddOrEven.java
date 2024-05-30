package week1.topic4.tasks;

import java.util.Scanner;

public class Task2_OddOrEven {
    public static void main(String[] args) {

        /*
        Напишете програма, която прочита число от конзолата и отпечатва дали то е четно или нечетно.
        Ако числото е четно, трябва да се изпише “even” (без кавичките), а ако е нечетно – трябва да се изпише “odd”.
        Подсказка: използвайте ternary оператора (?:)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете число: ");
        int n = scanner.nextInt();

        String isEvenOrOdd = n % 2 == 0 ? "even" : "odd";

        System.out.println(isEvenOrOdd);
    }
}
