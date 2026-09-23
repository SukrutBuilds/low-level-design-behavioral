package structural.bridge;


public class LoanAccount extends Account {
    private final double emiDue;

    public LoanAccount(String accountHolderName, double emiDue, NotificationChannel channel) {
        super(accountHolderName, 0, channel);
        this.emiDue = emiDue;
    }

    @Override
    public void checkAndAlert() {
        notifyHolder(String.format("EMI due reminder: INR %.2f is due for your loan account.", emiDue));
    }
}