package week3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Homework1_NameSorting {
    public static void main(String[] args) {
        /*
        Напишете програма, която:
        ● Изисква от потребителя да
        въвежда имена, докато въведе
        точка (.), като всяко име се
        запазва във списък.
        ● Програмата отпечатва 5-тия
        елемент от списъка.
        ● Сортира списъка по азбучен ред.
        ● Отпечатва сортирания списък.
         */
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> namesList = new ArrayList<>();
        while (true) {
            System.out.println("Въведете име(за изход въведете точка): ");
            String name = scanner.nextLine();
            if (name.equals(".")) {
                break;
            }
            namesList.add(name);
        }

        if (namesList.size() >= 5) {
            System.out.println("Петият елемент в списъка: " + namesList.get(4));
        } else {
            System.out.println("Няма достатъчно имена в списъка.");
        }

        Collections.sort(namesList);

        System.out.println("Сортиране спсисък: " + namesList.toString().replace("[","").replace("]",""));
    }
}
