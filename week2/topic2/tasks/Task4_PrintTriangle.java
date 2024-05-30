package week2.topic2.tasks;

import java.util.Scanner;

public class Task4_PrintTriangle {
    public static void main(String[] args) {
        /*
        Направете програма, която очаква от потребителя да въведе размер на триъгълник (0, 30] и го печата на екрана така:

        1 2 3 4 5

        1 2 3 4

        1 2 3

        1 2

        1
         */

        Scanner scanner = new Scanner(System.in);

        int sizeOfTriangle = scanner.nextInt();

        for (int i = 1; i <= sizeOfTriangle; i++) {
            for (int j = 1; j <= (sizeOfTriangle - i) + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
