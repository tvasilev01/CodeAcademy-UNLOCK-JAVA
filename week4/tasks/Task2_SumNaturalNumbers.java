package week4.tasks;

import java.util.Scanner;

public class Task2_SumNaturalNumbers {
    public static void main(String[] args) {
        /*
        Целите, положителни числа 1,2,3 … се казват още натурални числа.
        Нека вашата програма очаква от потребителя да въведе едно число и после използвайки рекурсивна функция,
        да изчисли сбора на всички числа от 1 до въведеното число.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете цяло число: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Въведеното число трябва да бъде по-голямо от 0.");
        } else {
            int sum = calculateSum(n);
            System.out.println("Сборът на всички натурални числа от 1 до " + n + " е: " + sum);
        }
    }

    private static int calculateSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + calculateSum(n - 1);
        }
    }
}
