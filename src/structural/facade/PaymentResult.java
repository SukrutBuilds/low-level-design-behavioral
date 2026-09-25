package structural.facade;

public class PaymentResult {
    private final boolean success;
    private final String message;

    private PaymentResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public static PaymentResult success(String transactionId) {
        return new PaymentResult(true, "Payment successful. Transaction ID: " + transactionId);
    }

    public static PaymentResult failed(String reason) {
        return new PaymentResult(false, reason);
    }

    public boolean isSuccess() { return success; }
    public String getMessage() { return message; }

    @Override
    public String toString() {
        return "PaymentResult{success=" + success + ", message='" + message + "'}";
    }
}