package week2.topic2.tasks;

import java.util.Scanner;

public class Task3_Palindrom {
    public static void main(String[] args) {

        /*
        Направете програма, която прочита дума от конзолата и проверява дали е палиндром.
        Игнорирайте малки-големи букви.
        Ако думата е палиндром, да отпечата true, в противен случай false.
        Палиндром е дума, която се чете еднакво отпред и отзад. Например следните думи са палиндроми: mom, radar, nikokin
        Тази задача е една от най-често срещаните при технически интервюта.
         */

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String reverseWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }

        if(word.equalsIgnoreCase(reverseWord)){
            System.out.println(word + " is a palindrom.");
        }else{
            System.out.println(word + " is not a palindrom.");
        }
    }
}
