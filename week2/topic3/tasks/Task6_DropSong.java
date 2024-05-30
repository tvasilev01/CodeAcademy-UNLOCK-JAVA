package week2.topic3.tasks;

import java.util.Scanner;

public class Task6_DropSong {
    public static void main(String[] args) {
        /*
        Направете програма, която очаква потребителят да въведе някакво число.
        След това ако числото се дели:
            на 3 – отпечатва “Пльок”
            на 5 – “Пляс”
            на 7 – “Пльос”
        Ако не се дели на нито едно от горните, се печата въведеното число. Въвеждането е в цикъл и продължава докато потребителят въведе числото 0.
        При 0 трябва да отпечатате “Пльок Пляс Пльос” – защото 0 се дели без остатък на всички числа.
        Примери: 28 се дели на 1, 2, 4, 7, 14, 28 – значи печатаме “Пльос” 30 се дели на 1, 2, 3, 5, 6, 10, 15, 30 – печатаме “Пльок Пляс” 34 се дели 1, 2, 17 и 34, така че просто отпечатваме “34”
         */

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Въведете други число което е по-голямо от 0: ");
            int number = scanner.nextInt();

            if(number == 0){
                System.out.println("Пльок Пляс Пльос");
                break;
            }

            String result = "";
            if(number % 3 == 0){
                result += "Пльок ";
            }
            if(number % 5 == 0) {
                result += "Пляс ";
            }
            if(number % 7 == 0){
                result += "Пльос ";
            }

            if(number % 3 != 0 && number % 5 != 0 && number % 7 != 0){
                System.out.println(number);
            }else{
                System.out.println(result);
            }
        }
    }
}
