package week2.topic1;

import java.util.Scanner;

public class Homework4_InsuranceCalculator {
    public static void main(String[] args) {

        /*
        Калкулатор на осигуровките:
          ○ Потребителят въвежда заплата, години
          ○ Има 2 такси които се плащат - едната от потребителя, другата - от неговия работодател
          ○ Ако е под 3000 лв важат следните правила:
            ■ Ако е 55 или < , тогава таксите са: 20% + 17%
            ■ Ако е (55-60] - 13% + 13%
            ■ Ако е (60-65] - 7.5% + 9%
            ■ Ако е над 65 - 5% + 7.5%
          ○ Ако е над 3000 лв - тогава таксите са 20% + 20% но само върху сумата от 3000 лв.
          ○ Тук трябва да се наблегне над това, че може да има вложени if-ове.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете годишната заплата: ");
        double annualIncome = scanner.nextDouble();

        System.out.println("Въведете възрастта: ");
        int age = scanner.nextInt();

        double employeeTax = 0;
        double employerTax = 0;

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

        System.out.println("Такса която е платена от служителя: " + employeeTax);
        System.out.println("Такса която е платена от работодателя: " + employerTax);
    }
}
