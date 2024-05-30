package week3.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1_FindListElement {
    public static void main(String[] args) {
        /*
        Направете променлива, която е списък от цели числа.
        Инициализирайте списъка със следните елементи: 1, 4, 6, 2, 10, 5.
        Напишете програма, която очаква потребителя да въведе число
        и след това намира на кой индекс се намира това число в даденият масив.
        Ако числото не е в списъка, нека програмата отпечата -1.
        Вижте метода ArrayList.indexOf()
         */
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(2);
        numbers.add(10);
        numbers.add(5);

        System.out.println("Въведете число: ");
        int target = scanner.nextInt();

        int index = numbers.indexOf(target);

        if (index != -1) {
            System.out.println("Числото " + target + " се намира на индекс " + index + " в списъка.");
        } else {
            System.out.println(-1);
        }
    }
}
