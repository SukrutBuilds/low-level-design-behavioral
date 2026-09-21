package behavioral.strategy;

import java.math.BigDecimal;

public interface EMICalculationStrategy {

    BigDecimal calculateEMI(BigDecimal principal , BigDecimal annualRatePercentage , int tenureMonths);
}
