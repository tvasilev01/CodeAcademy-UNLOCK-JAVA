package week6.task5;

import java.util.Random;

public class CustomRandom extends Random {
    /*
    Дефинирайте наследник на клас наследник Random, който да има метод връщащ случайни числа от тип double в интервал double [а,b].
    (Разгледайте какви методи вече са дефинирани и вижте кой е най-лесно да бъде модифициран, така, че да ви свърши работа;
     */
    public double nextDoubleRange(double min, double max) {
        //Генерира се случайно число в интервала [0, 1]
        double randomValue = nextDouble();

        //Преобразуване до интервала [a, b]
        return min + randomValue * (max - min);
    }

    public static void main(String[] args) {
        CustomRandom customRandom = new CustomRandom();

        double randomNumber = customRandom.nextDoubleRange(1.0, 10.0);
        System.out.println("Random number in range: " + randomNumber);

    }
}
