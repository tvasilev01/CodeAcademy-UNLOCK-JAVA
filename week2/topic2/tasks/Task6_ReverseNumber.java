package week2.topic2.tasks;

import java.util.Scanner;

public class Task6_ReverseNumber {
    public static void main(String[] args) {

        /*
        Направете програма, която печата цифрите на въведено от конзолата цяло число в обратен ред.
        Ако числото е отрицателно – просто игнорирайте знака.
        Подсказка: Нека имаме числото 456.
        Ако вземем остатъка от делене на числото 456 на 10, ще получим 6
        Ако вземем остатъка от делене на числото 45 на 10, ще получим 5
        Ако вземем остатъка от делене на числото 4 на 10, ще получим 4
        Ако отпечатваме с print, вместо print всяка цифра, която отпечатваме, ще е на същият ред.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете число, различно от 0: ");

        int number = scanner.nextInt();

       do {
           System.out.print(number % 10);
           number = number / 10;
       }while (number != 0);
    }
}
