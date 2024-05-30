package week4.tasks;

import java.util.Scanner;

public class Homework4_MinGap {
    /*
Напишете програма, която очаква потребителя да въведе масив от int числа от конзолата.
След това този масив се подава на статичен метод computeMinGap(array), който връща най-малката разлика м/у числата.
Например при следният масив:
int[] array = {1,3,6,7,12};
Имаме следните разлики – 2 (3-1), 3 (6-3), 1 (7-6), 5 (12-7). Така, че при този масив, функцията трябва да върне 1.
Имайте предвид, че разликата може и да е отрицателна, например при масива {3, 5, 10, 11, 4, 8}. В този случай разликата -7 (4-11) е най-малката и именно това е резултата, който трябва да върне функцията.
Макар и на пръв поглед безмислена, информацията от тази програма може да е полезна. Например, ако върнатият резултат е >= 0, тогава сте сигурни, че масива е сортиран (от по-малко към по-голямо). Ако резултата е >0, освен, че е сортиран, масивът също така съдържа само уникални числа.
Програмата очаква от потребителя:
броят на числата, които ще се въвеждат
всички числа
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете броя на числата: ");
        int count = scanner.nextInt();

        int[] array = new int[count];


        for (int i = 0; i < count; i++) {
            System.out.print("Въведете число " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int minGap = computeMinGap(array);

        System.out.println("Най-малката разлика между числата в масива е: " + minGap);
    }

    public static int computeMinGap(int[] array) {
        if (array.length < 2) {
            return 0;
        }

        int minGap = Integer.MAX_VALUE;


        for (int i = 1; i < array.length; i++) {
            int gap = array[i] - array[i - 1];
            if (gap < minGap) {
                minGap = gap;
            }
        }

        return minGap;
    }
}
