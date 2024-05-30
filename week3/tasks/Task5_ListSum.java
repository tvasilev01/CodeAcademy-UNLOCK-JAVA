package week3.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5_ListSum {
    /*
    Напишете програма, която събира въведените от потребителя цели числа.
    Въвеждането продължава докато потребителя въведе 0.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        int number;
        do {
            System.out.print("Въведете число (0 за да спрете програмата.): ");
            number = scanner.nextInt();
            numbers.add(number);
        } while (number != 0);

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Сумата на въведените числа: " + sum);
    }
}
