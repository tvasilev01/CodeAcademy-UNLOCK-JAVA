package week2.topic3.tasks;

import java.util.Scanner;

public class Task5_Div3 {
    public static void main(String[] args) {
        /*
        Изпишете не екрана на конзолата числата от 1 до 40 включително, които се делят без остатък на 3.
        Нека всяко число, делящо се на 3, е отпечатано на отделен ред.
        Използвайте оператора %.
         */

        for (int number = 1; number <= 40; number++) {
            if(number % 3 == 0){
                System.out.println(number);
            }
        }
    }
}
