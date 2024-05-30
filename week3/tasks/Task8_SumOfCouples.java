package week3.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task8_SumOfCouples {
    /*
    Напишете програма, която изисква от потребителя да въвежда цели числа от конзолата и въвеждането продължава, докато въведе 0. (Игнорирайте нулата и не я слагайте в масива/списъка)
    След това потребителят трябва да въведе още едно число sum.
    Отпечатайте всички двойки числа от въведените преди това, чиято сума е равна на sum.
    Например, ако потребителят въведе числата [2, 3, 4, 5, 1] и след това въведе сумата 6, тогава трябва да отпечата:
    2 4
    5 1
    Защото:
    2 + 4 = 6
    5 + 1 = 6
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Въведете число (за край натиснете '0'): ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            numbers.add(number);
        }

        System.out.print("Въведете сума: ");
        int targetSum = scanner.nextInt();

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                int num1 = numbers.get(i);
                int num2 = numbers.get(j);
                int sum = num1 + num2;
                if (sum == targetSum) {
                    System.out.println(num1 + " " + num2);
                }
            }
        }
    }
}
