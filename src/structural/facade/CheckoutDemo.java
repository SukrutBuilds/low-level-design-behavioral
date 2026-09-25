package structural.facade;


public class CheckoutDemo {
    public static void main(String[] args) {
        PaymentFacade facade = new PaymentFacade(
                new FraudDetectionService(),
                new PaymentGatewayClient(),
                new CoreLedgerService(),
                new NotificationService()
        );

        System.out.println("--- Scenario 1: Normal checkout ---");
        System.out.println(facade.processCheckout(new CheckoutRequest("user-1", 2500, "tok_visa_123")));

        System.out.println("\n--- Scenario 2: High-risk amount, blocked before gateway is even called ---");
        System.out.println(facade.processCheckout(new CheckoutRequest("user-2", 150000, "tok_visa_456")));

        System.out.println("\n--- Scenario 3: Gateway decline, ledger and notification never run ---");
        System.out.println(facade.processCheckout(new CheckoutRequest("user-3", 3000, "DECLINE")));
    }
}