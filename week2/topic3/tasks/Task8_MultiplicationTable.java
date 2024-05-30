package week2.topic3.tasks;

import java.util.Scanner;

public class Task8_MultiplicationTable {
    public static void main(String[] args) {
        /*
        Вашата програма очаква от потребителя да въведе число.
        След това отпечатва таблица за умножението на това число със всички числа от 1 до 10.
        Изхода на екрана трябва да е подобен на този даден в примера.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете число: ");
        int number = scanner.nextInt();

        System.out.println("Таблица за умножение със числото " + number);
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%d X %d = %d\n",number,i, result);
        }
    }
}
