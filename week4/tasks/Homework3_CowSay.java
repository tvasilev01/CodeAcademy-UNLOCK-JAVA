package week4.tasks;

import java.util.Scanner;

public class Homework3_CowSay {
    /*
      Linux командата cowsay показва на екрана една крава и билборд, на който пише произволен текст:

——————————

| If you have Egyptian flu:  |

| you’re going to be a mummy |

——————————

                                 ^__^

                                 (oo)_______

                                  (__)       )/

                                      ||—-w |

                                      ||     ||

    Напишете програма която имитира CowSay. Имайте предвид, че височината на билборда се мени в зависимост от размера на текста, но не и широчината!

    Направете метод say(String text).

    Стринга, който трябва да се отпечата се въвежда от клавиатурата.

    За по-любопитните:

    Направете животното анимирано – да се движи от десният, към левият край на екрана. Използвайте следната escape последователност:

    System.out.print(“�33[2J�33[1;1H”); // clear screen & go to top-left position

    Както и помощният метод:
    Имайте предвид, че под Windows няма как да изкарате анимация. А под Linux или MacOS трябва да пуснете програмата в терминала на операционната система, не на IntelliJ IDEA.
    НЕ ПРАЩАЙТЕ ТОВА РЕШЕНИЕ! Системата ще го приеме като невярно решение.
     */

    public static void main(String[] args) {
        System.out.println("Въведете текст за изобразяване:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        say(text);
    }

    public static void say(String text) {
        String[] lines = text.split("\n");
        int maxLength = 0;
        for (String line : lines) {
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }

        StringBuilder border = new StringBuilder();
        border.append("+");
        for (int i = 0; i < maxLength + 2; i++) {
            border.append("-");
        }
        border.append("+");

        System.out.println(border);

        for (String line : lines) {
            int spaces = maxLength - line.length();
            System.out.println("| " + line + " ".repeat(spaces) + " |");
        }

        System.out.println(border);
        System.out.println("        \\   ^__^");
        System.out.println("         \\  (oo)_______");
        System.out.println("           (__)         )\\");
        System.out.println("               ||----W |  #");
        System.out.println("               ||     ||");
        System.out.println("               ww     ww");
    }
}
