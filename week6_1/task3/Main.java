package week6_1.task3;

import week6.task1.Bird;

import javax.crypto.spec.DESedeKeySpec;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /*
            1.В задачата Animals(task1 в package week6) от миналия път добавете класове Parrot, Pigeon, Seagull които наследяват Bird. 2. Променете както следва имплементацията на методa sing() във всеки един от наследните на Bird.
                Parrot -> I am singing “How are you”
                Pigeon -> I am singing “Gu Gu Gu”
                Seagull -> I am singing “Kra Kra Kra”
            Добавете и клас Mammal които има два child класа Cat и Dog.
            Cat има метод meow(), а Dog – bark()
            Създайте клас Petshop който има метод printCatalogue. Използвайте метод overloading за да направите две различни имплементации на printCatalogue.
            4.1. printCatalogue() – извежда номерирано всички животни за които програмата знае
            1. Birds:
            1.1. Pigeon
            1.2. Parrot
            1.3. Seagull
            Mammal:
            2.1. Dog
            2.2. Cat
            4.2. printCatalogue(AnimalType type) – извежда номериран каталог само за дадения тип (Mammal or Bird)
            Сега потребителят трябва да си избере животно въвеждайки неговия номер. В зависимост от типа животно то може да пее, лае или прави мяу.
            Изведете в конзолота резултата от извикването на sing(), bark() или meow() методите за избраното животно.
         */
        Scanner scanner = new Scanner(System.in);
        Petshop petshop = new Petshop();

        System.out.println("Choose an option:");
        System.out.println("1. Print Catalogue");
        System.out.println("2. Print Bird Catalogue");
        System.out.println("3. Print Mammal Catalogue");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                petshop.printCatalogue();
                break;
            case 2:
                petshop.printCatalogue(AnimalType.BIRD);
                break;
            case 3:
                petshop.printCatalogue(AnimalType.MAMMAL);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        System.out.println("Choose an animal:");
        int animalChoice = scanner.nextInt();

        switch (animalChoice) {
            case 1:
                week6_1.task3.Bird pigeon = new Pigeon();
                pigeon.sing();
                break;
            case 2:
                week6_1.task3.Bird parrot = new Parrot();
                parrot.sing();
                break;
            case 3:
                week6_1.task3.Bird seagull = new Seagull();
                seagull.sing();
                break;
            case 4:
                Mammal dog = new Dog();
                if (dog instanceof Dog) {
                    ((Dog) dog).bark();
                }
                break;
            case 5:
                Mammal cat = new Cat();
                if (cat instanceof Cat) {
                    ((Cat) cat).meow();
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }
}
