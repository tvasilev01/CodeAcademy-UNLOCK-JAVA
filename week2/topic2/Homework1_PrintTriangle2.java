package week2.topic2;

import java.util.Scanner;

public class Homework1_PrintTriangle2 {
    public static void main(String[] args) {

        /*
        Направете програма PrintTriangle2 която чете размер на тригълника от конзолата и
        печата следното:*/

        Scanner scanner = new Scanner(System.in);

        int sizeOfTriangle = scanner.nextInt();

        for (int i = 1; sizeOfTriangle >= 1; sizeOfTriangle--, i++) {

            for (int j = 0; j < sizeOfTriangle; j++) {
                System.out.print("# ");
            }

            System.out.println();

            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }

        }
    }
}
