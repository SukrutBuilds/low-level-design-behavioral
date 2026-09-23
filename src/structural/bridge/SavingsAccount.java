package structural.bridge;


public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 1000;

    public SavingsAccount(String accountHolderName, double balance, NotificationChannel channel) {
        super(accountHolderName, balance, channel);
    }

    @Override
    public void checkAndAlert() {
        if (balance < MIN_BALANCE) {
            notifyHolder(String.format(
                    "Low balance alert: savings balance is INR %.2f, below the minimum of INR %.2f.",
                    balance, MIN_BALANCE));
        } else {
            notifyHolder(String.format("Your savings account balance is INR %.2f.", balance));
        }
    }
}