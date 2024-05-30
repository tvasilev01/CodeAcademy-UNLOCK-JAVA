package week3.tasks;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2_Flag {
    public static void main(String[] args) {
        /*
        Напишете програма, която отпечатва фигурата по-долу на екрана:
        ██████████
        ██████████
        ██████████
        Създайте масив, който да запълните със символа ‘u2588’, използвайки метода Array.fill().
        Ако ви е интересно, можете да добавите цвят преди всеки ред като отпечатате стринга “�33[ЦВЯТm”, като за цвят имате следните числа:
        39 = бял
        32 = червен
        31 = зелен
         */

        char block = '\u2588';

        char[] blockLine = new char[10];
        Arrays.fill(blockLine, block);

        for (int i = 0; i < 3; i++) {
            System.out.println(blockLine);
        }
    }
}
