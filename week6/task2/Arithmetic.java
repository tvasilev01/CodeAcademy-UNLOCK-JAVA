package week6.task2;

public class Arithmetic {
    public int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public int add(int... numbers){
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
