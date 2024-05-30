package week1.topic4;

import java.util.Scanner;

public class Homework2_EvenOrOdd {
    public static void main(String[] args) {

        /*
        Напишете програма, която прочита число от конзолата и отпечатва дали то е четно или
        нечетно. (Подсказка: използвайте оператора ?:)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете число: ");
        int n = scanner.nextInt();

        String isEvenOrOdd = n % 2 == 0 ? "even" : "odd";

        System.out.println(isEvenOrOdd);
    }
}
