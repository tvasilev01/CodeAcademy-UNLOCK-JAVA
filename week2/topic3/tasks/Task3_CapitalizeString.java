package week2.topic3.tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task3_CapitalizeString {
    public static void main(String[] args) {
        /*
        Направете програма, която очаква потребителят да въведе едно цяло изречение.
        Нека вашата програма прочете изречението и след това, ако започва с малка буква да я смени на голяма.
        Нека добави точка, ако изречението не завършва със символ за край на изречението – точка, удивителна или въпросителна.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете изречение: ");

        String sentence = scanner.nextLine();

        if(sentence.length() > 0){
            if(Character.isLowerCase(sentence.charAt(0))){
                sentence = Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1);

            }

            char lastChar = sentence.charAt(sentence.length() - 1);
            if(lastChar != '.' && lastChar != '!' && lastChar != '?'){
                sentence = sentence + ".";
            }

            System.out.println("Форматирано изречение: " + sentence);
        }
    }
}
