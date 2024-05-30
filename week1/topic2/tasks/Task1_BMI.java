package week1.topic2.tasks;

import java.util.Scanner;

public class Task1_BMI {
    public static void main(String[] args) {
            /*
        Направете програма BMI, с която да изчислите моя Body Mass Index.
        Аз тежа 80кг и съм висок 171см. Ако съм съм надвишил малко теглото и съм Overweight
        напишете на екрана more training, less eating, ако не съм – напишете you rock!
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
            System.out.println("You are rock!");
        }else if(bmi < 24.9){
            System.out.println("Нормално тегло");
            System.out.println("You are rock!");
        }else if(bmi < 29.9){
            System.out.println("Наднормено тегло");
            System.out.println("More training, less eating.");
        }else{
            System.out.println("Затлъстяване");
            System.out.println("More training, less eating.");
        }


    }
}
