package week2.topic2.tasks;

import java.util.Scanner;

public class Task1_DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Направете програма, която очаква от потребителя да въведе размер на квадрат (0, 30] и го печата на екрана така:
         */

        System.out.println("Въведете размер на квадрата в интервала от [0 - 30]");
        int size = scanner.nextInt();

        for (int i = 0; i <  size; i++) {
            System.out.println();
            for (int j = 0; j <  size; j++) {
                System.out.print("# ");
            }

            System.out.println();
        }

        if(size <= 0 || size > 30){
            System.out.println("Невалиден размер на квадрат. Въведете число в интервала [0 - 30]");
        }
    }
}
