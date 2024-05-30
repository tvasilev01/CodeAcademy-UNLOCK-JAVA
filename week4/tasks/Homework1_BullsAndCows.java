package week4.tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework1_BullsAndCows {
    /*
    Бикове и крави е логическа игра за отгатване на цифри.
    Играе се от двама противника, като всеки се стреми да отгатне тайното число, намислено от другия.
    След всеки ход, противникът дава броя на съвпаденията.
    Играта протича по следния начин. На лист хартия всеки участник написва своето тайно число.
    Тайните числа са четирицифрени, като цифрите не трябва да се повтарят.
    След това, последователно един след друг, играчите задават въпрос с предположение за числото на противника.
    Противникът отговаря, като посочва броя на съвпаденията
    – ако дадена цифра от предположението се съдържа в тайното число и се намира на точното място, тя е „бик“, ако е на различно място, е „крава“.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] secretNumber = generateSecretNumber(random);
        System.out.println(Arrays.toString(secretNumber) + " - Генерирано число ");
        int attempts = 0;

        System.out.println("Добре дошли в играта 'Бикове и крави'!");
        System.out.println("Вашата цел е да отгатнете тайното четирицифрено число.");

        while (true) {
            int[] userGuess = getUserGuess(scanner);
            int[] result = evaluateGuess(secretNumber, userGuess);

            System.out.println("Бикове: " + result[0] + ", Крави: " + result[1]);
            attempts++;

            if (result[0] == 4) {
                System.out.println("Поздравления! Вие отгатнахте тайното число след " + attempts + " опита.");
                break;
            }
        }
    }

    public static int[] generateSecretNumber(Random random) {
        int[] secretNumber = new int[4];
        boolean[] usedDigits = new boolean[10];

        for (int i = 0; i < 4; i++) {
            int digit;
            do {
                digit = random.nextInt(10);
            } while (usedDigits[digit]);

            secretNumber[i] = digit;
            usedDigits[digit] = true;
        }

        return secretNumber;
    }

    public static int[] getUserGuess(Scanner scanner) {
        System.out.print("Въведете вашето предположение: ");
        String guessString = scanner.next();
        int[] userGuess = new int[4];

        for (int i = 0; i < 4; i++) {
            userGuess[i] =  userGuess[i] = guessString.charAt(i) - '0';
        }

        return userGuess;
    }

    public static int[] evaluateGuess(int[] secretNumber, int[] userGuess) {
        int[] result = new int[2];

        for (int i = 0; i < 4; i++) {
            if (secretNumber[i] == userGuess[i]) {
                result[0]++;
            } else if (containsDigit(secretNumber, userGuess[i])) {
                result[1]++;
            }
        }

        return result;
    }

    public static boolean containsDigit(int[] array, int digit) {
        for (int num : array) {
            if (num == digit) {
                return true;
            }
        }
        return false;
    }
}
