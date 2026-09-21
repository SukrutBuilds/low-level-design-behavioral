package behavioral.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FlatRateEMIStrategy implements  EMICalculationStrategy{
    @Override
    public BigDecimal calculateEMI(BigDecimal principal, BigDecimal annualRatePercentage, int tenureMonths) {
        BigDecimal tenureYears = BigDecimal.valueOf(tenureMonths)
                .divide(BigDecimal.valueOf(12), 10, RoundingMode.HALF_UP);

        BigDecimal totalInterest = principal
                .multiply(annualRatePercentage)
                .divide(BigDecimal.valueOf(100), 10, RoundingMode.HALF_UP)
                .multiply(tenureYears);

        BigDecimal totalPayable = principal.add(totalInterest);
        return totalPayable.divide(BigDecimal.valueOf(tenureMonths), 2, RoundingMode.HALF_UP);
    }
}
