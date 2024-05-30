package week2.topic1.tasks;

import java.util.Scanner;

public class Task5_InsuranceCalculator {
    public static void main(String[] args) {

        /*
            Направете програма, която изчислява осигуровките.
            За целта потребителя трябва да въведе следните данни:
            месечна заплата
            години
            Има 2 такси, които се плащат едната от служителя, а другата – от неговият работодател.
            Законът изисква:
                Ако заплатата е под 3000лв
                Ако служителя е на 55 години или по-малко, тогава таксите са: 20%(за работника) + 17%(за работодателя)
                Ако служителя е над 55 години до 60 (включително) – 13% + 13%
                Ако служителя е над 60 години до 65 (включително) – 7.5% + 9%
                Ако служителя е над 65 – 5% + 7.5%
                Ако заплатата е над 3000лв, таксите са 20% + 20%, но само върху сумата от 3000лв.
                Отпечатайте:
                първо колко е таксата за служителя
                колко е таксата за работодателя
                Не забравяйте, че можете да използвате вложени if-else структури.
                Имайте предвид, че мога да платя само до стотинка, но не и до части от стотинката.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете годишната заплата: ");
        double annualIncome = scanner.nextDouble();

        System.out.println("Въведете възрастта: ");
        int age = scanner.nextInt();

        double employeeTax;
        double employerTax;

        if(annualIncome < 3000){
            if(age <= 55) {
                employeeTax = annualIncome * 0.20;
                employerTax = annualIncome * 0.17;
            }else if(age <= 60){
                employeeTax = annualIncome * 0.13;
                employerTax = annualIncome * 0.13;
            }else if(age <= 65){
                employeeTax = annualIncome * 0.075;
                employerTax = annualIncome * 0.09;
            }else{
                employeeTax = annualIncome * 0.05;
                employerTax = annualIncome * 0.075;
            }
        }else{
            employeeTax = 3000 * 0.20;
            employerTax = 3000 * 0.20;
        }

        System.out.printf("Такса която е платена от служителя: %.2f\n", employeeTax);
        System.out.printf("Такса която е платена от работодателя %.2f ", employerTax);
    }
}
