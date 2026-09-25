package structural.facade;

import java.util.Random;

public class PaymentGatewayClient {
    private final Random random = new Random();

    public GatewayResponse charge(String cardToken, double amount) {
        System.out.println("[PaymentGateway] Charging card token " + cardToken + " for " + amount);
        if ("DECLINE".equals(cardToken)) {
            return GatewayResponse.failed("Card declined by issuing bank");
        }
        String transactionId = "txn_" + Math.abs(random.nextInt(999999));
        return GatewayResponse.success(transactionId);
    }
}