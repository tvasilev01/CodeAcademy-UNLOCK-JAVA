package week2.topic2;

import java.util.Scanner;

public class Homework3_Palindrom {
    public static void main(String[] args) {

        /*
        Направете програма Palindrom която прочита дума от конзолата
        и проверява дали е палиндром - чете се еднакво отпред и отзад.
        Например: mom, radar, nikokin
         */

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String reverseWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }

        if(word.equals(reverseWord)){
            System.out.println(word + " is a palindrom.");
        }else{
            System.out.println(word + " is not a palindrom.");
        }
    }
}
