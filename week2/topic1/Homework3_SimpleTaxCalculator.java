package week2.topic1;

import java.util.Scanner;

public class Homework3_SimpleTaxCalculator {
    public static void main(String[] args) {

        /*
        Калкулатор на данъците - ако е стълбица
            ○ Да се въведе годишната заплата
            ○ Данъкът за първите 20000 е 0, вторите 20к е 10%, третите 20к е 20%, за останалите е 30%
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете годишната заплата: ");
        double annualIncome = scanner.nextDouble();

        double tax = 0;

        if(annualIncome <= 20_000){
            tax = 0;
        }else if(annualIncome <= 40_000){
            tax = (annualIncome - 20_000) * 0.10;
        }else if(annualIncome <= 60_000){
            tax = (annualIncome - 40_000) * 0.20;
        }else{
            tax = (annualIncome - 40_000) * 0.30;
        }

        System.out.println("Годишен данък: " + tax);



    }
}
