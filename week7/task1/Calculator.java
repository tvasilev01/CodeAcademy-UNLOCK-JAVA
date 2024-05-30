package week7.task1;

public class Calculator implements AdvancedArithmetic{
    public int divisionSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
