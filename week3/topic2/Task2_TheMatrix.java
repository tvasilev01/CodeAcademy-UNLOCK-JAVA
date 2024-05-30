package week3.topic2;

import java.util.Scanner;

public class Task2_TheMatrix {
    /*
    Направете програма, която:
    Очаква потребителят да въведе редове (<10). Докато потребителят не въведе коректен ред, програмата продължава да го пита за броя на редовете.
    Използвайте подканващ стринг “Брой редове: “
    Очаква потребителят да въведе колони (<10). Докато потребителят не въведе коректна колона, програмата продължава да го пита за броя на колоните.
    Използвайте подканващ стринг “Брой колони: “
    Иска от него да въведе двете матрици, които са съставени от цели числа. Използвайте същите подканващи низове като в дадения пример.
    След това тя трябва да отпечата:
    Двете матрици една до друга. Отделете двете матрици с низа ” | “
    стринга “Сумата на матриците е:” на отделен ред
    Сборът им (поелементарна сума)
    стрингът “Директната сумата на матриците е:” на отделен ред
    Сборът им (пряка/директна сума)
    Като отпечатвате елементите на матрицата, нека те заемат 4 символа и да са подравняване наляво.
    За помощ използвайте wikipedia или MathIsFun
    Наблегнете на валидирането на входните данни при въвеждане размера на матрицата.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 0;
        int cols = 0;

        while(rows < 1 || rows > 10){
            System.out.print("Брой редове (1 до 10): ");
            rows = scanner.nextInt();
        }

        while(cols < 1 || cols > 10){
            System.out.print("Брой колони (1 до 10): ");
            cols = scanner.nextInt();
        }

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Въвеждане на първата матрица: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Въведете елемент [" + i + "]["+ j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Въвеждане на втората матрица: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Въведете елемент [" + i + "]["+ j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Матрица 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", matrix1[i][j]);
            }
            System.out.println();
        }

        System.out.println("Матрица 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", matrix2[i][j]);
            }
            System.out.println();
        }

        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Сумата на матриците е: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", sumMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
