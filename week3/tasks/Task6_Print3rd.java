package week3.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task6_Print3rd {
    /*
    Напишете програма, която изисква от потребителя да въвежда имена от конзолата, като въвеждането приключва, когато потребителя въведе точка (.).
    Отпечатайте 3-тото въведено име на екрана.
    Сортирайте списъка и отпечатайте сортирания списък.
    Какво ще направите ако няма 3ти елемент? Може би съобщение за грешка?
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.println("Въведете име (за край на програмта натиснете '.'): ");
            String name = scanner.nextLine();
            if (name.equals(".")) {
                break;
            }
            names.add(name);
        }

        if (names.size() >= 3) {
            String thirdName = names.get(2);
            System.out.println("Третото въведено име е: " + thirdName);

            Collections.sort(names);
            System.out.println("Сортиран списък с имената: " + names.toString().replaceAll("[\\[\\]]", ""));
        } else {
            System.out.println("Опа. Няма въведено трето име. :(");
        }
    }
}
