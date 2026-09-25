package structural.facade;

public class CheckoutRequest {
    private final String userId;
    private final double amount;
    private final String cardToken;

    public CheckoutRequest(String userId, double amount, String cardToken) {
        this.userId = userId;
        this.amount = amount;
        this.cardToken = cardToken;
    }

    public String getUserId() { return userId; }
    public double getAmount() { return amount; }
    public String getCardToken() { return cardToken; }
}