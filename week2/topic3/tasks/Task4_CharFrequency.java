package week2.topic3.tasks;

import java.util.Scanner;

public class Task4_CharFrequency {
    public static void main(String[] args) {
        /*
        Направете програма, която очаква от потребителяt да въведе:
        Изречение
        Символ
        Нека вашата програма изчисли колко пъти въведения символ се среща в изреченито и да го отпечата на екрана.
        Метода str.charAt(i) връща символа от даденият стринг на позиция i.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете изречение: ");
        String input = scanner.nextLine();

        System.out.println("Въведете символ, който искате да изчислите колко пъти се среща в изречението: ");
        char targetChar = scanner.nextLine().charAt(0);

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
           if(input.charAt(i) == targetChar){
               count++;
           }
        }

        System.out.printf("Символът \"%s\" се среща %d пъти в изречението.", targetChar, count);
    }
}
