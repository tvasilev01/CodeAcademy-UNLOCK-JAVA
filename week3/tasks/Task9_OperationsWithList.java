package week3.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task9_OperationsWithList {
    public static void main(String[] args) {
        /*
        Напишете програма която:
        Чете от конзолата числа които са елементи на List
        Извежда следната информация за списъка: дължина, всички елементи
        Сортира списъка и извежда резултата
        Обръща елементите на списъка (1 2 3 -> 3 2 1)
        Чете елементите на втори списък.
        Сравнява двата списъка елемент по елемент
        и на всяка итерация извежда следното съобщение “Елемент N от списък 1 е по-малък/по-голям от елемент X от списък 2.”
         */
        Scanner scanner = new Scanner(System.in);

        // Четене на числа от конзолата и създаване на списък
        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.print("Въведете брой елементи: ");
        int n = scanner.nextInt();

        System.out.println("Въведете елементите на списъка: ");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            list1.add(element);
        }

        // Извеждане на информация за списъка
        System.out.println("Дължина на списъка: " + list1.size());
        System.out.println("Всички елементи на списъка: " + list1.toString().replaceAll("[\\[\\]]", ""));

        // Сортиране на списъка и извеждане на резултата
        Collections.sort(list1);
        System.out.println("Сортиран списък: " + list1);

        // Обръщане на елементите на списъка
        Collections.reverse(list1);
        System.out.println("Обърнат списък: " + list1);

        // Четене на елементите на втори списък
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("Въведете брой елементи за втория списък: ");
        int n2 = scanner.nextInt();

        System.out.println("Въведете елементите на втория списък: ");
        for (int i = 0; i < n2; i++) {
            int element = scanner.nextInt();
            list2.add(element);
        }

        for (int i = 0; i < list1.size(); i++) {
            int element1 = list1.get(i);
            int element2 = list2.get(i);
            if (element1 < element2) {
                System.out.printf("Елемент %d от списък 1 е по-малък от елемент %d от списък 2.\n", element1, element2);
            } else if (element1 > element2) {
                System.out.printf("Елемент %d от списък 1 е по-голям от елемент %d от списък 2.\n", element1, element2);
            } else {
                System.out.printf("Елемент %d от списък 1 е равен на елемент %d от списък 2.\n", element1, element2);
            }
        }
    }
}
