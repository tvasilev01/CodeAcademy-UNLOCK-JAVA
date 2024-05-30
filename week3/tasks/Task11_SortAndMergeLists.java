package week3.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task11_SortAndMergeLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Напишете програма която:
            Чете два списъка от конзолата
            Сортира ги
            Обединява ги в един нов трети списък.
         */
        System.out.print("Въведете първия списък като разделите елементите със запетая: ");
        String firstInput = scanner.nextLine();
        String[] elements1 = firstInput.split(",");
        ArrayList<String> firstList = new ArrayList<>();
        for (String element : elements1) {
            firstList.add(element.trim());
        }

        System.out.print("Въведете втория списък като разделите елементите със запетая: ");
        String secondInput = scanner.nextLine();
        String[] elements2 = secondInput.split(",");
        ArrayList<String> secondList = new ArrayList<>();
        for (String element : elements2) {
            secondList.add(element.trim());
        }

        Collections.sort(firstList);
        Collections.sort(secondList);

        ArrayList<String> mergedList = new ArrayList<>(firstList);
        mergedList.addAll(secondList);

        System.out.println("Сортиран първи списък: " + firstList);
        System.out.println("Сортиран втори списък: " + secondList);
        System.out.println("Обединен списък: " + mergedList);
    }
}
