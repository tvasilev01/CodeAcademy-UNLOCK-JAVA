package week4.tasks;

import java.util.Scanner;

public class Homework5_PrintPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Изберете фигура (a, b или c): ");
        char choice = scanner.next().charAt(0);
        System.out.print("Въведете размер: ");
        int size = scanner.nextInt();

        System.out.println();

        if(choice == 'a'){
            printPatternA(size);
        }else if(choice == 'b'){
            printPatternB(size);
        }else if(choice == 'c'){
            printPatternC(size);
        }else{
            System.out.println("Невалиден избор на фигура.");
        }
    }

    private static void printPatternC(int size) {

    }

    private static void printPatternB(int size) {

    }

    private static void printPatternA(int size) {
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < 2 * (size - i) - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
