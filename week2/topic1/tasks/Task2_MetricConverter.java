package week2.topic1.tasks;

import java.util.Scanner;

public class Task2_MetricConverter {
    public static void main(String[] args) {

        /*
            Нека напишем програма, която конвертира между 8 метрични единици: m, mm, cm, mi, in, km, ft, yd.
            Ето таблицата за конвертиране на 1 meter (m):
            1000 millimeters (mm)
            100 centimeters (cm)
            0.000621371192 miles (mi)
            39.3700787 inches (in)
            0.001 kilometers (km)
            3.2808399 feet (ft)
            1.0936133 yards (yd)
            Програмата трябва да очаква от потребителя да въведе следните данни:
            дължината, която трябва да се конвертира
            нейната метрична единица
            към коя метрична единица да се конвертира
            Използвайте switch вместо вложени if-else. Ако не е валидна матрична единица отпечатайте грешка и излезте от
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете дължината: ");
        double length = scanner.nextDouble();

        System.out.println("Изберете метрична единица (m, mm, cm, mi, in, km, ft, yd)");
        String fromUnit = scanner.next().toLowerCase();

        System.out.println("Изберете метрична единица към която да конвертирате (m, mm, cm, mi, in, km, ft, yd)");
        String toUnit = scanner.next().toLowerCase();

        double result = -1;

        switch (fromUnit){
            case "m":
                switch (toUnit){
                    case "m":
                        result = length;
                        break;
                    case "mm":
                        result = length * 1000;
                        break;
                    case "cm":
                        result = length * 100;
                        break;
                    case "mi":
                        result = length * 0.000621371192;
                        break;
                    case "in":
                        result = length * 39.3700787;
                        break;
                    case "km":
                        result = length * 0.001;
                        break;
                    case "ft":
                        result = length * 3.2808399;
                        break;
                    case "yd":
                        result = length * 1.0936133;
                        break;
                }
                break;
            case "mm":
                switch (toUnit){
                    case "m":
                        result = length * 0.001;
                        break;
                    case "mm":
                        result = length;
                        break;
                    case "cm":
                        result = length * 0.01;
                        break;
                    case "mi":
                        result = length * 6.21371192e-7;
                        break;
                    case "in":
                        result = length * 0.0393700787;
                        break;
                    case "km":
                        result = length * 1e-6;
                        break;
                    case "ft":
                        result = length * 0.0032808399;
                        break;
                    case "yd":
                        result = length * 0.0010936133;
                        break;
                }
                break;
            case "cm":
                switch (toUnit){
                    case "m":
                        result = length * 0.01;
                        break;
                    case "mm":
                        result = length * 10;
                        break;
                    case "cm":
                        result = length;
                        break;
                    case "mi":
                        result = length * 6.21371192e-6;
                        break;
                    case "in":
                        result = length * 0.393700787;
                        break;
                    case "km":
                        result = length * 1e-5;
                        break;
                    case "ft":
                        result = length * 0.032808399;
                        break;
                    case "yd":
                        result = length * 0.0109361331;
                        break;
                }
                break;
            case "mi":
                switch (toUnit){
                    case "m":
                        result = length * 1609.344;
                        break;
                    case "mm":
                        result = length * 1609344;
                        break;
                    case "cm":
                        result = length * 160934.4;
                        break;
                    case "mi":
                        result = length;
                        break;
                    case "in":
                        result = length * 63360;
                        break;
                    case "km":
                        result = length * 1.609344;
                        break;
                    case "ft":
                        result = length * 5280;
                        break;
                    case "yd":
                        result = length * 1760;
                        break;
                }
                break;
            case "in":
                switch (toUnit){
                    case "m":
                        result = length * 0.0254;
                        break;
                    case "mm":
                        result = length * 25.4;
                        break;
                    case "cm":
                        result = length * 2.54;
                        break;
                    case "mi":
                        result = length * 1.5782828e-5;
                        break;
                    case "in":
                        result = length;
                        break;
                    case "km":
                        result = length * 2.54e-5;
                        break;
                    case "ft":
                        result = length * 2.54e-5;
                        break;
                    case "yd":
                        result = length * 0.0277777778;
                        break;
                }
                break;
            case "km":
                switch (toUnit){
                    case "m":
                        result = length * 1000;
                        break;
                    case "mm":
                        result = length * 1e+6;
                        break;
                    case "cm":
                        result = length * 1e+5;
                        break;
                    case "mi":
                        result = length * 0.621371192;
                        break;
                    case "in":
                        result = length * 39370.0787;
                        break;
                    case "km":
                        result = length;
                        break;
                    case "ft":
                        result = length * 3280.8399;
                        break;
                    case "yd":
                        result = length * 1093.6133;
                        break;
                }
                break;
            case "ft":
                switch (toUnit){
                    case "m":
                        result = length * 0.3048;
                        break;
                    case "mm":
                        result = length * 304.8;
                        break;
                    case "cm":
                        result = length * 30.48;
                        break;
                    case "mi":
                        result = length * 1.89393939394e-4;
                        break;
                    case "in":
                        result = length * 12;
                        break;
                    case "km":
                        result = length * 0.0003048;
                        break;
                    case "ft":
                        result = length;
                        break;
                    case "yd":
                        result = length * 0.3333333333;
                        break;
                }
                break;
            case "yd":
                switch (toUnit){
                    case "m":
                        result = length * 0.9144;
                        break;
                    case "mm":
                        result = length * 914.4;
                        break;
                    case "cm":
                        result = length * 91.44;
                        break;
                    case "mi":
                        result = length * 5.68181818182e-4;
                        break;
                    case "in":
                        result = length * 36;
                        break;
                    case "km":
                        result = length * 0.0009144;
                        break;
                    case "ft":
                        result = length * 3;
                        break;
                }
                break;

        }

        if(result != -1.0){
            System.out.println("Резултатът е: " + result + " " + toUnit);
        }else{
            System.out.println("Невалидна метрична единица.");
        }
    }
}
