package behavioral.strategy;

import java.math.BigDecimal;

public class LoanApplicationDemo {
    public static void main(String[] args) {
        BigDecimal principal = new BigDecimal("500000");
        BigDecimal annualRate = new BigDecimal("10");
        int tenureMonths = 24;


        LoanEMICalculator calculator = new LoanEMICalculator(new FlatRateEMIStrategy());
        System.out.println("Personal loan (Flat Rate) EMI: " + calculator.computeEMI(principal, annualRate, tenureMonths));


        calculator.setStrategy(new ReducingBalanceEMIStrategy());
        System.out.println("Home loan (Reducing Balance) EMI: " + calculator.computeEMI(principal, annualRate, tenureMonths));
    }
}