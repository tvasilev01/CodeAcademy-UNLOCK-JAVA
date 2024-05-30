package week1.topic4;

import java.util.Scanner;

public class Homework1_SquareRoot {
    public static void main(String[] args) {

        /*
        Напишете програма, която чете 1 число от конзолата, изчислява му корен квадратен и
        отпечатва резултата на екрана, с точност до 5-тия знак след запетаята.
         */

        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();

        if(n > 0){
            double squareRoot = Math.sqrt(n);
            System.out.printf("Корен квадратен от %.5f е %.5f: ", n, squareRoot);
        }else{
            System.out.println("Не можем да имаме корен квадратен от 0 или отрицателно число");
        }
    }
}
