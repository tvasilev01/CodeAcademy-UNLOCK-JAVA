package week2.topic2.tasks;

import java.util.Scanner;

public class Task5_PrintTriangle2 {
    public static void main(String[] args) {
        /*
        Направете програма, която очаква от потребителя да въведе размер на триъгълник (0, 30] и го печата на екрана така:
        # # # # # #
          # # # # #
            # # # #
              # # #
                # #
                  #
         */
        Scanner scanner = new Scanner(System.in);

        int sizeOfTriangle = scanner.nextInt();

        if(sizeOfTriangle <= 0 || sizeOfTriangle > 30){
            System.out.println("Невалиден размер на триъгълник. Въведете число в интервала [0 - 30]");
        }

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
