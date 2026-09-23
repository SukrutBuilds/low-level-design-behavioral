package structural.bridge;


public abstract class Account {
    protected final String accountHolderName;
    protected double balance;
    protected NotificationChannel channel;

    protected Account(String accountHolderName, double balance, NotificationChannel channel) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.channel = channel;
    }

    public void setChannel(NotificationChannel channel) {
        this.channel = channel;
    }

    public abstract void checkAndAlert();

    protected void notifyHolder(String message) {
        channel.send(accountHolderName, message);
    }
}