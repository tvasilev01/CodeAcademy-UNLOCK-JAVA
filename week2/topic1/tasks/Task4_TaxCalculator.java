package week2.topic1.tasks;

import java.util.Scanner;

public class Task4_TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
            Напишете програма – калкулатор на данъците.
            В България имаме плосък данък, което означава, че винаги имаме 10% данък независимо от заплатата ни.
            Но в някои държави данъка зависи от това колко ни е голяма заплатата.
            Именно такъв калкулатор ще направим!
            Като за начало, в нашата програма трябва да въведем годишната заплата.
            След това да изчислим данъка както следва:
                за първите 20000 няма данък
                за вторите 20000 има данък от 10%, но само върху парите надвишаващи необлагаемите доходи.
                за третите 20000 данъкът е както следва: ** 0 за първите 20000 ** 10% за вторите 20000 ** 20% за парите над 40000
                всички пари над 60000 се таксуват с 30%
                Пример: ако имам годишна заплата 83000, ще трябва да платя:
                0 за първите 20к
                10% от вторите 20к – т.е. 2000
                20% от третите 20к – т.е. 4000
                30% от останалите 23000 – т.е. 6900
                или общо 12900
                Имайте предвид, че мога да платя само до стотинка, но не и до части от стотинката.
         */

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

        System.out.printf("Годишен данък: %.2f", tax);
    }
}
