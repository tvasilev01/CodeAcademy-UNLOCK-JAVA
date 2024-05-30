package week6.task2;

import java.util.Random;

public class ArithmeticTest {
    public static void main(String[] args) {
        /*
        Arithmetic Operations
        Напишете клас Arithmetic който има метод add. Методът приема като аргументи две цели числа и връща тяхната сума.
        Напишете клас Adder който наследява Arithmetic.
        В ArithemticTest.java създайте променлива “arithmetic” от тип Arithmetic която да е инстанция на Adder. Принтирайте в конзолата следните редове: System.out.println(arithmetic.getClass()); System.out.println(arithmetic.getClass().getSuperclass()); Ако не разбирате какво означава този изход кажете ми на следващата лекция за да го обясним.
        Сега добавете още един метод add в клас Arithmetic който събира неопределен брой цели числа.
        В main метода генерирайте цяло число N между 2 и 20 включително. След това генерирайте N на брой случайни цели числа и ги подайте на add метода.
        А сега нека N = 2,000,000,000 -> Какво стана?
         */
        Arithmetic arithmetic = new Adder();
        System.out.println(arithmetic.getClass());
        System.out.println(arithmetic.getClass().getSuperclass());

        Random random = new Random();
        int n = random.nextInt(2,20);
        System.out.println("Генерирано число(от 2 до 20): " + n);

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt();
        }

        int sum = arithmetic.add(numbers);

        System.out.println("Сума: " + sum);


    }
}
