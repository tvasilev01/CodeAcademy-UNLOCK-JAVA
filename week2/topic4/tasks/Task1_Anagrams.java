package week2.topic4.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_Anagrams {
    public static void main(String[] args) {
        /*
        Направeте програма, която прочита две думи от конзолата и отпечатва true, ако те са анаграми и false, ако не са.
        Абстрахирайте се от големината на буквите.
        Анаграми са Java и Vaaj например. И двата стринга са съставени от едни и същи букви, които са в разбъркан ред.
        Подсказка: String.toCharArray() методът ще ви помогне да конвертирате стринга в масив от char елементи.
        За да може да сравните дали са еднакви, ще се наложи да ги подредите по един и същ ред.
        Не забравяйте един от най-добрите приятели на програмиста – не кучето, а класът Arrays. Той може да ви е от изключителна полза.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете първата дума: ");
        String word1 = scanner.nextLine().toLowerCase();

        System.out.println("Въведете втората дума: ");
        String word2 = scanner.nextLine().toLowerCase();

        if(word1.length() != word2.length()){
            System.out.println("false");
            return;
        }

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        boolean areAnagrams = Arrays.equals(word1Array,word2Array);

        if(areAnagrams){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
