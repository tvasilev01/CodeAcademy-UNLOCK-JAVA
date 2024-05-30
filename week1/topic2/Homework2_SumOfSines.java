package week1.topic2;

import java.util.Scanner;

public class Homework2_SumOfSines {
    public static void main(String[] args) {
        /*
        Напишете програма SumOfSines, в която дефинирате променлива t (в градуси) и изчислява
        резултата от sin(2t) + sin(3t). Използвайте Math.sin() функцията.
         */

        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();

        double radians = Math.toRadians(t);

        double sin2t = Math.sin(2*radians);
        double sin3t = Math.sin(3*radians);

        double result = sin2t + sin3t;

        System.out.println("sin(2t) + sin(3t) при t = " + t + " градуса е " + result);


    }
}

