package week2.topic1.tasks;

import java.util.Scanner;

public class Task3_NumberOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
            Да се отпечата “с думи” броя на думите във въведеното изречение на български език.
            Използване на String.split().length за да определите броят на думите.
            Ако са повече от 10 – просто отпечатва “твърде дълго изречение” (без кавичките)
         */

        System.out.println("Въведете изречение на български: ");
        String input = scanner.nextLine();

        int wordCount = 0;

        boolean isWord = false;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if(Character.isLetter(currentChar)){
                if(!isWord){
                    wordCount++;
                    isWord = true;
                }
            }else{
                isWord = false;
            }
        }

        if(wordCount > 10){
            System.out.println("Твърде дълго изречение");
        }else{
            System.out.println("Брой думи в изречението: " + wordCount);
        }
    }
}
