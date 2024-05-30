package week2.topic2;

import java.util.Scanner;

public class Homework2_Vowels {
    public static void main(String[] args) {

        /*
        Направете програма Vowels, която прочита изречение от конзолата и отпечатва колко
        гласни има в него.
        /Подсказка - използвайте
        String.length() и String.chartAt(i)/
         */

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int vowelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u'){
                vowelCount++;
            }
        }

        System.out.println("Брой гласни букви: " + vowelCount);


    }
}
