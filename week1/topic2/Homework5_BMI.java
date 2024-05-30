package week1.topic2;

import java.util.Scanner;

public class Homework5_BMI {
    public static void main(String[] args) {

        /*
        Направете програма BMI с която да изчислите вашият Body Mass Index.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете вашето тегло(в килограми): ");
        double weight = scanner.nextDouble();

        System.out.println("Въведете вашата височина(в метри): ");
        double height = scanner.nextDouble();

        double bmi = weight / (Math.pow(height,2));

        System.out.println("Вашата BMI категория е: " + bmi);
        if(bmi < 18.5){
            System.out.println("Поднормено тегло");
        }else if(bmi < 24.9){
            System.out.println("Нормално тегло");
        }else if(bmi < 29.9){
            System.out.println("Наднормено тегло");
        }else{
            System.out.println("Затлъстяване");
        }



    }
}

