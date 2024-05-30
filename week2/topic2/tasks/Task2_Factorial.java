package week2.topic2.tasks;

import java.util.Scanner;

public class Task2_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Направете програма Factorial, която изчислява факториел на положително число въведено от конзолата.
        Потребителят може да въведе невалидно число (нула или отрицателно). Искайте да въведе число, докато не въведе положително.
        Ако не си спомняте от математиката:
        Факториел на 3 = 3 * 2 * 1
        Факториел на 50 = 50 * 49 * 48 … * 2 * 1
         */

        System.out.println("Въведете число: ");
        int number = scanner.nextInt();
        int fact = 1;
        while (number <= 0){
            System.out.println("Невалидно число. Въведете число по-голямо 0");
            number = scanner.nextInt();
        }

            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.print("Факториела на " + number + " е " + fact);
    }
}
