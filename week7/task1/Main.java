package week7.task1;

public class Main {
    public static void main(String[] args) {
        /*
        Създайте интерфейс AdvancedArithmetic който има абстрактен метод divisorSum(n).
        Създайте клас Calculator който имплементира AdvancedArithmetic т. че divisorSum(n) да връща сбора на всички числа които делят n.
         */
        Calculator calculator = new Calculator();
        int result = calculator.divisionSum(12);
        System.out.println("Сборът на делителите на 12 е: " + result);
    }
}
