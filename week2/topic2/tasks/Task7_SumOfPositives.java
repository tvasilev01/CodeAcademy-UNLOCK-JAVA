package week2.topic2.tasks;

import java.util.Scanner;

public class Task7_SumOfPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Напишете програма, която събира въведените от потребителя числа, докато въведе 0 или отрицателно число.
        Нека всеки път преди потребителяt въведе число, да се отпечатва подканващ стринг “Въведете положително число: “. Потребителят трябва да може да въведе числото на същият ред, а не на следващ.
        Отпечатайте :
            Сумата с точност до вторият знак след десетичната запетая.
            Кое е най-голямото въведено число
            Кое е най-малкото въведено число
            Помислете кой цикъл е най-добре да използвате? while, do-while или for?
         */

        double maxNumber = Double.MIN_VALUE;
        double minNumber = Double.MAX_VALUE;
        double sum = 0.0;

        while (true){
            System.out.println("Въведете положително число: ");

            double number = scanner.nextDouble();

            if(number <= 0){
                break;
            }

            sum += number;

            if (number > maxNumber){
                maxNumber = number;
            }

            if (number < minNumber){
                minNumber = number;
            }
        }

        if(sum == 0){
            System.out.println("Не сте въвели положително число");
        }else {
            System.out.printf("Сумата на всички числа е: %.2f\n", sum);
            System.out.println("Най-голямото число е: " + maxNumber);
            System.out.println("Най-малкото число е: " + minNumber);
        }
    }
}



