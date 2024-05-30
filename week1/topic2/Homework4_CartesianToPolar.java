package week1.topic2;

import java.util.Scanner;

public class Homework4_CartesianToPolar {
    public static void main(String[] args) {
        /*
        Напишете програма CartesianToPolar която дефинира 2 double координати x и y и изчислява
        съответните им r и theta поларни координати. (За tan-1 използвайте Math.atan2() функцията).

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете координата x: ");
        double x = scanner.nextDouble();
        System.out.println("Въведете координата y: ");
        double y = scanner.nextDouble();

        double r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2)); // Изчисляване на разстоянието r
        double theta = Math.atan2(y,x); // Изчисляване на ъгъла theta

        System.out.println("Поларни координати");
        System.out.println("r = " + r);
        System.out.println("θ = " + theta);




    }
}
