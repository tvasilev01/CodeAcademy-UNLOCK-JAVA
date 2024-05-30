package week2.topic2.tasks;

import java.util.Scanner;

public class Task8_Vowels {
    public static void main(String[] args) {

          /*
        Направете програма Vowels, която прочита изречение (на английски) от конзолата и отпечатва колко гласни има в него.
        Дължината на String можете да вземете чрез метода String.length(), например: “hello world”.length(). А за да вземете първият символ от стринга, ползвайте “hello world”.charAt(0)
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
