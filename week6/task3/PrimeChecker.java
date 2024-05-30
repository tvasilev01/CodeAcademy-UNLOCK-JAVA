package week6.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        /*
        Напишете клас PrimeChecker който има метод checkPrime.
        Напишете програма която чете от входа N nа брой числа и извежда в конзолата само простите. (N може да бъде първото въведено число)
        Примерен вход: 3 (N) 5 (number 1) 6 (number 2) 7 (number 3)
        Примерен изход: 5, 7
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете N на брой числа: ");
        int n = scanner.nextInt();

        PrimeChecker primeChecker = new PrimeChecker();

        System.out.println("Въведете " + n + " числа: ");

        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ".");
            int number = scanner.nextInt();

            if (primeChecker.checkPrime(number)) {
                primeNumbers.add(number);
            }
        }
        System.out.println("Прости числа: " + primeNumbers.toString().replace("[", "").replace("]", ""));
    }

    private boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
