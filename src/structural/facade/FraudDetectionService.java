package structural.facade;

public class FraudDetectionService {
    private static final double HIGH_RISK_AMOUNT = 100000;

    public RiskAssessment evaluateRisk(String userId, double amount) {
        System.out.println("[FraudDetection] Evaluating risk for user " + userId + ", amount " + amount);
        boolean highRisk = amount > HIGH_RISK_AMOUNT;
        return new RiskAssessment(highRisk);
    }
}