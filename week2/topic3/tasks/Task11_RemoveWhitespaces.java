package week2.topic3.tasks;

import java.util.Scanner;

public class Task11_RemoveWhitespaces {
    public static void main(String[] args) {
        /*
        Направете програма, която очаква от потребителя да въведе изречение.
        След въвеждане на изречението, вашата програма трябва да премахне всички празни символи и табулация от изречението и да го отпечата на екрана.
         */
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        sentence = sentence.replaceAll("\\s","");
        System.out.println(sentence);
    }
}
