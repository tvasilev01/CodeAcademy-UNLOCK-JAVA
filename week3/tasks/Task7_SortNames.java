package week3.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task7_SortNames {
    /*
    Напишете програма, която изисква от потребителя да въведе 3 имена от конзолата.
    След това, имената се сортират в азбучен ред и се отпечатват на екрана.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Въведете име: ");
            String name = scanner.nextLine();
            names.add(name);
        }

        Collections.sort(names);

        System.out.println("Сортирани имена: ");
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". " + names.get(i));
        }
    }
}
