package week2.topic1;

import java.util.Scanner;

public class Homework1_BigOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Напишете програма, която прочита 2 числа от конзолата и печата кое е по-голямото.
         */

        System.out.println("Въведете първото число: ");
        double n1 = scanner.nextDouble();
        System.out.println("Въведете второто число: ");
        double n2 = scanner.nextDouble();

        if(n1 > n2){
            System.out.println(n1 + " е по-голямо от " + n2);
        }else{
            System.out.println(n2 + " е по-голямо от " + n1);
        }
    }
}
