package week3.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4_ListRemoveOdd {
    /*
    Направете променлива, която е списък от цели числа. Инициализирайте списъка със следните елементи: 1, 4, 6, 2, 10, 5.
    Напишете програма, която да премахне всеки елемент на нечетна позиция от списъка. Внимавайте с for-a – ако махнете първият елемент – вторият ще стане първи.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(4);
        numbersList.add(6);
        numbersList.add(2);
        numbersList.add(10);
        numbersList.add(5);

        for (int i = numbersList.size() - 1; i >= 0; i = i - 2) {
            System.out.println("Премахнат елемент на нечетна позиция: " + numbersList.remove(i));
        }

        String result = numbersList.toString().replaceAll("[\\[\\]]", "");
        System.out.println("Списък след премахване на елементите на нечетна позиция: " + result);
    }
}
