package week1.topic3;

import java.util.Random;

public class Homework_Base36 {
    public static void main(String[] args) {

        /*
        Направете програма Base36,
        която печата случаен низ от букви и цифри, като генерира случайно long число и го конвертира към base 36(36-тичен) формат.
         */

        //Генериране на случайно long число

        long randomLNumber = new Random().nextLong();

        //Конвериране на long числото в base 36
        String base36F = Long.toString(randomLNumber, 36).toUpperCase();

        System.out.println("Случаен низ в base36 формат - " + base36F);



    }
}
