package structural.facade;

public class RiskAssessment {
    private final boolean highRisk;

    public RiskAssessment(boolean highRisk) {
        this.highRisk = highRisk;
    }

    public boolean isHighRisk() {
        return highRisk;
    }
}