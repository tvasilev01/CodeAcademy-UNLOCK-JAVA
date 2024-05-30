package week2.topic1.tasks;

import java.util.Scanner;

public class Task1_BigOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
            Напишете програма, която прочита 2 числа със запетая от конзолата и печата кое е по-голямото.
            Отпечатаният резултат трябва да съдържа само числото без никакви допълнителни пояснения.
            Например: “резултатът е 10” e невалидно.
         */

        System.out.println("Въведете първото число: ");
        double n1 = scanner.nextDouble();
        System.out.println("Въведете второто число: ");
        double n2 = scanner.nextDouble();

        if(n1 > n2){
            System.out.print("Най-голямото число - ");
            System.out.println(n1);
        }else{
            System.out.print("Най-голямото число - ");
            System.out.println(n2);
        }
    }
}
