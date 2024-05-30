package week1.topic4.tasks;

import java.util.Scanner;

public class Task1_InputAndSqrt {
    public static void main(String[] args) {

        /*
        Напишете програма, която чете 1 число от конзолата, изчислява му корен квадратен и отпечатва резултата на екрана с точност до 5-тия знак след запетаята.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете число: ");
        double n = scanner.nextDouble();

        double squareRoot = Math.sqrt(n);

        System.out.println("Корен квадратен с точност до 5-тия знак след запетаята: " + String.format("%.5f", squareRoot));
    }
}
