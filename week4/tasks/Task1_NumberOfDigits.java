package week4.tasks;

import java.util.Scanner;

public class Task1_NumberOfDigits {
    public static void main(String[] args) {
        /*
        Направете метод, който отпечатва броя на цифри в дадено число.
        Направете програма, която очаква от потребителя да въведе цяло число
        и след това извиква горният метод, за да отпечата броят на цифрите във веведеното число.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);

        System.out.println("Брой на цифрите в числото: " + digitCount);
    }

    private static int countDigits(int number) {
        number = Math.abs(number);

        int count = 0;

        while(number > 0){
            number /= 10;
            count++;
        }

        return count;
    }
}
