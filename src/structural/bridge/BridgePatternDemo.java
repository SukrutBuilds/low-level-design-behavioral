package structural.bridge;

/** CLIENT. */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("Sukrut Desai", 450, new SMSChannel());
        Account loan = new LoanAccount("Sukrut Desai", 15000, new EmailChannel());
        Account creditCard = new CreditCardAccount("Sukrut Desai", 42000, 50000, new PushNotificationChannel());

        savings.checkAndAlert();
        loan.checkAndAlert();
        creditCard.checkAndAlert();


        savings.setChannel(new EmailChannel());
        savings.checkAndAlert();
    }
}