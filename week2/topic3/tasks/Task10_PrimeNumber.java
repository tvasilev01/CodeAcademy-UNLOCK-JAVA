package week2.topic3.tasks;

import java.util.Scanner;

public class Task10_PrimeNumber {
    public static void main(String[] args) {
        /*
        Направете програма, която очаква от потребителя да въведе число.
        След това проверява дали числото е просто и отпечатва true, ако е, false, ако не е.
        Простото число може да се дели само на 1 и на себе си. Ако се дели на което и да е друго цяло число, тогава не е просто.
        Подсказка: ако имате числото 77, тогава то определено няма как да се дели на числото 38 (= 77 / 2) или по-голямо.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете число: ");
        int number = scanner.nextInt();

        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime);


    }
}
