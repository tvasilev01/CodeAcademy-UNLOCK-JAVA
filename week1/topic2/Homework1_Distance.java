package week1.topic2;

import java.util.Scanner;

public class Homework1_Distance {
    public static void main(String[] args) {
        /*
        Напишете програма Distance, която изчислява разстоянието от точка (x,y) до (0,0) по формулата:
        distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете x: ");
        double x = scanner.nextDouble();

        System.out.println("Въведете y: ");
        double y = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("Разстоянието от точка (" + x + ", " + y + ") до (0, 0) е " + distance);




    }
}


