package week2.topic3.tasks;

import java.util.Scanner;
/*
    Боби е тийнейджър и има “изобилен” речник:
    Ако го попиташ нещо, отговаря с “Добре.”
    Ако му се развикаш (Нетикет: ТОВА Е ВИКАНЕ – т.е. ако сме написали всичко с главни букви, значи му викаме), той отговаря със “Споко бе, ман!”
    Ако му извикаш въпрос, следва “Спокоооо, знам к’во правя!”
    Ако просто го посочиш или го гледаш лошо, без да му говориш, той отговаря с “Хубаво деее”
    На всичко останало, което му говориш, той кима мъдро и продумва тихо “Ахъ.”.
    Направете програма, в която потребителят може да “говори” с Боби, въвеждайки изречение от конзолата в безкраен цикъл. В зависимост от въведеното изречение, програмата трябва да отпечата отговора на Боби.
    Ако въведете точка програмата спира изпълнението си.
    Ето примерен разговор:
    Здрасти!
    Ахъ.
    Какво е това Ахъ?
    Добре.
    ЧУ ЛИ МЕ?
    Спокоооо, знам к’во правя!
    ТИ НЕ СИ ДОБРЕ!
    Споко бе, ман!
    Хубаво деее
 */

public class Task14_Bobi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Вие: ");
            String myQuestion = scanner.nextLine();
            String bobiQuestion = "";

            switch (myQuestion){
                case "Здрасти!":
                    bobiQuestion = "Боби: Ахъ.";
                    break;
                case "Какво е това Ахъ?":
                    bobiQuestion = "Боби: Добре.";
                    break;
                case "ЧУ ЛИ МЕ?":
                    bobiQuestion = "Боби: Спокоооо, знам к'во правя!";
                    break;
                case "ТИ НЕ СИ ДОБРЕ!":
                    bobiQuestion = "Боби: Споко бе, ман!";
                    break;
                case "Хубаво деее":
                    bobiQuestion = "Боби: Хубаво деее";
                    break;
                case ".":
                    System.out.println("Програмата приключи.");
                    scanner.close();
                    return;
                default:
                    bobiQuestion = "Боби: Ахъ.";
                    break;
            }
            System.out.println(bobiQuestion);
        }
    }
}
