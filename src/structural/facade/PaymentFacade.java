package structural.facade;


public class PaymentFacade {

    private final FraudDetectionService fraudService;
    private final PaymentGatewayClient gatewayClient;
    private final CoreLedgerService ledgerService;
    private final NotificationService notificationService;

    public PaymentFacade(FraudDetectionService fraudService,
                         PaymentGatewayClient gatewayClient,
                         CoreLedgerService ledgerService,
                         NotificationService notificationService) {
        this.fraudService = fraudService;
        this.gatewayClient = gatewayClient;
        this.ledgerService = ledgerService;
        this.notificationService = notificationService;
    }

    public PaymentResult processCheckout(CheckoutRequest request) {

        RiskAssessment risk = fraudService.evaluateRisk(request.getUserId(), request.getAmount());
        if (risk.isHighRisk()) {
            return PaymentResult.failed("Blocked due to high fraud risk.");
        }


        GatewayResponse auth = gatewayClient.charge(request.getCardToken(), request.getAmount());
        if (!auth.isSuccessful()) {
            return PaymentResult.failed("Payment authorization failed: " + auth.getErrorMessage());
        }


        ledgerService.recordTransaction(request.getUserId(), request.getAmount(), auth.getTransactionId());


        notificationService.sendReceipt(request.getUserId(), request.getAmount());

        return PaymentResult.success(auth.getTransactionId());
    }
}