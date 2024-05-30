package week3.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task10_ListUnionAndIntersection {
    public static void main(String[] args) {
        /*
        Напишете програма която:
        Чете два списъка от конзолата
        Извежда в конзолата тяхното обединение и сечение. Ползвайте ArrayList или LinkedList.
         */
        Scanner scanner = new Scanner(System.in);

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

        ArrayList<String> union = new ArrayList<>(firstList);
        union.addAll(secondList);

        ArrayList<String> intersection = new ArrayList<>(firstList);
        intersection.retainAll(secondList);

        System.out.println("Обединение: " + union);
        System.out.println("Сечение: " + intersection);
    }
}
