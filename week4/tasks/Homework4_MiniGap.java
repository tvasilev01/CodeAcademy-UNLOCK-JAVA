package week4.tasks;

import java.util.Scanner;

public class Homework4_MiniGap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя на числата: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Въведете число " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int minGap = computeMinGap(array);
        System.out.println("Най-малката разлика между числата е: " + minGap);
    }

    public static int computeMinGap(int[] array) {
        if (array.length < 2) {
            System.out.println("Масивът трябва да съдържа поне две числа.");
            return -1;
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
