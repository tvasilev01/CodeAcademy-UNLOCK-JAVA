package week2.topic1;

import java.util.Scanner;

public class Homework2_WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Да се отпечата “с думи” броят на думите във въведеното изречение.
            ○ Използване на String.split()
            ○ Ако са повече от 10 - просто отпечатва “твърде дълго изречение.
         */

        System.out.println("Въведете изречение: ");
        String input = scanner.nextLine();

        int wordCount = input.split("").length;

        if(wordCount > 10){
            System.out.println("Твърде дълго изречение");
        }else{
            System.out.printf("Дължината на изречението е %d символа." , wordCount);
        }


    }
}
