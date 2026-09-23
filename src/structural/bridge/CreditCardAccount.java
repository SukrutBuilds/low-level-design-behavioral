package structural.bridge;


public class CreditCardAccount extends Account {
    private final double outstandingDue;
    private final double creditLimit;

    public CreditCardAccount(String accountHolderName, double outstandingDue, double creditLimit,
                             NotificationChannel channel) {
        super(accountHolderName, 0, channel);
        this.outstandingDue = outstandingDue;
        this.creditLimit = creditLimit;
    }

    @Override
    public void checkAndAlert() {
        double utilization = (outstandingDue / creditLimit) * 100;
        if (utilization > 80) {
            notifyHolder(String.format(
                    "High credit utilization alert: %.1f%% of your limit is used.", utilization));
        } else {
            notifyHolder(String.format("Outstanding due on your credit card: INR %.2f", outstandingDue));
        }
    }
}