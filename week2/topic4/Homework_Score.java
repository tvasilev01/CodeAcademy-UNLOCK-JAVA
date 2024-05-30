package week2.topic4;

import java.util.Scanner;

public class Homework_Score {
    public static void main(String[] args) {
        /*
        Подканва потребителя да въведе брой на
        състезателите и след това да въведе
        техния резултат в секунди и се записват в
        масив.
        ● Отпечатва:
        ○ Всички резултати
        ○ Най-бързия
        ○ Най-бавния
        ○ Средно аритметично (avg)
        ○ Стандартно отклонение (standard
        deviation). За помощ:
        ■ сд1 = сумата от всички ( (елемент -
        avg) на квадрат)
        ■ сд = корен квадратен ( сд1 / броя на
        елементите)
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете брой на състезателите: ");
        int numParticipants = scanner.nextInt();

        double[] results = new double[numParticipants];

        for (int i = 0; i < numParticipants; i++) {
            System.out.print("Въведете резултат за състезател " + (i + 1) + " (в секунди): ");
            results[i] = scanner.nextDouble();
        }

        System.out.println("Всички резултати:");
        for (int i = 0; i < numParticipants; i++) {
            System.out.println("Състезател " + (i + 1) + ": " + results[i] + " сек.");
        }

        double fastest = results[0];
        for (int i = 1; i < numParticipants; i++) {
            if (results[i] < fastest) {
                fastest = results[i];
            }
        }

        System.out.println("Най-бързият резултат: " + fastest + " сек.");

        double slowest = results[0];
        for (int i = 1; i < numParticipants; i++) {
            if (results[i] > slowest) {
                slowest = results[i];
            }
        }

        System.out.println("Най-бавният резултат: " + slowest + " сек.");

        double sum = 0;
        for (int i = 0; i < numParticipants; i++) {
            sum += results[i];
        }

        double average = sum / numParticipants;
        System.out.println("Средно аритметично: " + average + " сек.");

        double squaredDifferencesSum = 0;
        for (int i = 0; i < numParticipants; i++) {
            squaredDifferencesSum += Math.pow(results[i] - average, 2);
        }

        double standardDeviation = Math.sqrt(squaredDifferencesSum / numParticipants);
        System.out.println("Стандартно отклонение: " + standardDeviation + " сек.");
    }
}
