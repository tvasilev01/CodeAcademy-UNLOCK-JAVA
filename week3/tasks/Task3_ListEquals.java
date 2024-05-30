package week3.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3_ListEquals {
    /*
    Създайте списък от цели числа със следните елементи: { 1, 10, 15 }
    Напишете програма, която очаква потребителя да въведе 3 числа, които съхранявате в друг списък.
    Сверете дали елементите на въведения списък са същите като в първия и ако са, отпечатайте “true”, в противен случай – “false”.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(10);
        firstList.add(15);

        ArrayList<Integer> secondList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Въведете число: ");
            int number = scanner.nextInt();
            secondList.add(number);
        }

        boolean areEqual = firstList.equals(secondList);

        if (areEqual) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
