package week1.topic3.tasks;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task5_EMI {
    public static void main(String[] args) {

        /*
        Приравнена месечна вноска e фиксирана сума за плащане, направена от кредитополучател на кредитор на определена дата всеки календарен месец. Приравнени месечни вноски се използват за изплащане на лихви и главници всеки месец, така че за определен брой години заемът се изплаща изцяло заедно с лихвите.
        Годишната вноска се изчислява по формулата:
        Където:

        P е заетата сума
        r е годишната лихва
        n е броят на вноските
        За да изчислите месечната вноска, трябва да разделите ‘r’ на 12.

        Купил съм си апартамент, за който съм заел от банка 10 000 000 евро при годишна лихва 10.5% и смятам да го изплатя за 10 години.

        Колко ще е моята месечна вноска?

        ИЗПОЛЗВАЙТЕ BigDecimal!

        Отпечатайте така: System.out.println(A.setScale(10, RoundingMode.HALF_UP));

        Когато използвате метода divide на BigDecimal, го извикайте по следния начин:

        import java.math.BigDecimal;

        import java.math.RoundingMode;

        .....

        myDecimal.divide(anotherBigDecimal, RoundingMode.HALF_UP)
        */

       int principal = 10_000_000; //P
        double annualInterestRate = 10.5;
       double monthlyInterestRate = annualInterestRate / (100*12); //r
        int numberOfPaymentsInMonths = 10 * 12;  //n

        BigDecimal numerator = BigDecimal.valueOf(principal * monthlyInterestRate * (Math.pow(1 + monthlyInterestRate,numberOfPaymentsInMonths)));
        BigDecimal denominator = BigDecimal.valueOf(Math.pow(1 + monthlyInterestRate,numberOfPaymentsInMonths) - 1);
        BigDecimal pmt = numerator.divide(denominator, RoundingMode.HALF_UP);

        System.out.println(pmt.setScale(10, RoundingMode.HALF_UP));

    }
}
