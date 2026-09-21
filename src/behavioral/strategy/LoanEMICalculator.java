package behavioral.strategy;

import java.math.BigDecimal;


public class LoanEMICalculator {

    private EMICalculationStrategy strategy;

    public LoanEMICalculator(EMICalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(EMICalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal computeEMI(BigDecimal principal, BigDecimal annualRatePercent, int tenureMonths) {
        return strategy.calculateEMI(principal, annualRatePercent, tenureMonths);
    }
}