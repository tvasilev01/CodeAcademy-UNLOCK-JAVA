package week2.topic3.tasks;

import java.util.Scanner;

public class Task1_99bottles {
    public static void main(String[] args) {
        /*
        Използвайте цикъл, за да направите програма, която отпечатва текста на класиката:
        99 bottles of beer on the wall, 99 bottles of beer.
        Take one down and pass it around, 98 bottles of beer on the wall.
        …..
        2 bottles of beer on the wall, 2 bottles of beer.
        Take one down and pass it around, 1 bottle of beer on the wall.
        1 bottle of beer on the wall, 1 bottle of beer.
        Take it down and pass it around, no more bottles of beer on the wall.
        No more bottles of beer on the wall, no more bottles of beer.
        Go to the store and buy some more, 99 bottles of beer on the wall.
        Важно е между всеки стих да има празен ред!
         */

        int numBottles = 99;

        while (numBottles > 0) {
            System.out.println(numBottles + " bottles of beer on the wall, " + numBottles + " bottles of beer.");
            System.out.println("Take one down and pass it around, " + (numBottles - 1) + " bottles of beer on the wall.");
            System.out.println();

            numBottles--;

            }
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
        }
}
