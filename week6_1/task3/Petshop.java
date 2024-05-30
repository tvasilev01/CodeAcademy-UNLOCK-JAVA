package week6_1.task3;

public class Petshop {
    public void printCatalogue() {
        System.out.println("1. Birds:");
        System.out.println("    1. Pigeon");
        System.out.println("    2. Parrot");
        System.out.println("    3. Seagull");

        System.out.println("2. Mammals:");
        System.out.println("    4. Dog");
        System.out.println("    5. Cat");
    }

    public void printCatalogue(AnimalType type) {
        if (type == AnimalType.BIRD) {
            System.out.println("1. Birds:");
            System.out.println("    1. Pigeon");
            System.out.println("    2. Parrot");
            System.out.println("    3. Seagull");
        } else if (type == AnimalType.MAMMAL) {

            System.out.println("2. Mammals:");
            System.out.println("    4. Dog");
            System.out.println("    5. Cat");
        }
    }
}
