package week1.topic3.tasks;

public class Task6_Base36 {
    public static void main(String[] args) {

        /*
        Говорихме, че има различни бройни системи. Има двоична, осмична, десетична шестнадесетична… и.т.н.
        Една доста интересна бройна система е 36-тичната. Защо? Защото съдържа всички цифри от 0 до 9, така и всички букви от английската азбука – A до Z.
        Сега задачата ви е да направите програма, която показва как изглеждат числата в различните бройни системи.
        Затова трябва да отпечатате числото 0x7DEDEDE1 в:

        Двоичен формат (с представка 0b отпред)
        Осмичен формат (с представка 0 отпред)
        Десетичен формат
        Шестнадесетичен формат (с представка 0x и ако има букви в числото, те да са малки)
        36-тично, като всички букви са главни.
         */

        int number = 0x7DEDEDE1;

        String binaryFormat = Integer.toBinaryString(number);
        System.out.printf("Двоичен формат: 0b%s\n", binaryFormat);

        String octalFormat = Integer.toOctalString(number);
        System.out.printf("Осмичен формат: 0%s\n", octalFormat);

        String decimalFormat = Integer.toString(number);
        System.out.printf("Десетичен формат: %s\n",decimalFormat);

        String hexadecimalFormat = Integer.toHexString(number);
        System.out.printf("Шестнадесетичен формат: 0x%s\n", hexadecimalFormat);

        String base36Format = Long.toString(number,36).toUpperCase();
        System.out.println("36-тично: " + base36Format);





    }
}
