package week1.topic2.tasks;

public class Task2_DivideBy17 {
    public static void main(String[] args) {
           /*
        Измислих си едно число – 8589935681. Чудя се дали се дели на 17.
        Напишете програма, която проверява дали числото се дели на 17. И ако е така – напишете на екрана yes, в противен случай напишете no.
        Подсказка – използвайте операторите ‘остатък от делене’ и ternary оператор.
         */

        long n = 8589935681L;
        String result = (n % 17 == 0) ? "yes" : "no";
        System.out.println(result);
    }
}
