package week4.tasks;

import java.util.Scanner;

public class Homework2_CaesarCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Caesar’s Code е една от най-проститите техники за криптиране.
        Всяка една буква от изречението е заменена с друга буква, която е (n) на брой позиции в азбуката.
        Така ‘A’ се заменя с ‘D’, ‘B’, с ‘E‘ … ,’X’ със ‘A’ …, ‘Z’ със ‘C’.
        Напишете програма която иска от потребителя да направи избор – дали да криптира или да декриптира.
        Въвежда се кода (n) – броят на позицииите.
        След това потребителят трябва да въведе стринг, който може да съдържа както малки, така и големи латински букви
        и съответно генерира криптиран стринг, или декодира въведеният стринг.
        Резултатът винаги се печата само с големи букви.
        В програмата си дефинирайте статични методи, наречете ги crypt & decrypt.
         */

        System.out.println("Изберете опция: 1 (за криптиране) или 2 (за декриптиране):");
        int choice = scanner.nextInt();

        System.out.println("Въведете броя на позициите (n):");
        int n = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Въведете текст:");
        String inputText = scanner.nextLine();

        processChoice(choice, n, inputText);
    }

    private static void processChoice(int choice, int n, String inputText) {
        if (choice == 1) {
            String encryptedText = encrypt(inputText, n);
            System.out.println("Криптиран текст: " + encryptedText);
        } else if (choice == 2) {
            String decryptedText = decrypt(inputText, n);
            System.out.println("Декриптиран текст: " + decryptedText);
        } else {
            System.out.println("Невалиден избор.");
        }
    }

    public static String encrypt(String text, int n) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char encryptedChar = (char) (base + (c - base + n) % 26);
                result.append(encryptedChar);
            } else {
                result.append(c);
            }
        }
        return result.toString().toUpperCase();
    }

    public static String decrypt(String text, int n) {
        return encrypt(text, 26 - n);
    }
}
