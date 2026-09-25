package structural.facade;

public class GatewayResponse {
    private final boolean successful;
    private final String transactionId;
    private final String errorMessage;

    private GatewayResponse(boolean successful, String transactionId, String errorMessage) {
        this.successful = successful;
        this.transactionId = transactionId;
        this.errorMessage = errorMessage;
    }

    public static GatewayResponse success(String transactionId) {
        return new GatewayResponse(true, transactionId, null);
    }

    public static GatewayResponse failed(String errorMessage) {
        return new GatewayResponse(false, null, errorMessage);
    }

    public boolean isSuccessful() { return successful; }
    public String getTransactionId() { return transactionId; }
    public String getErrorMessage() { return errorMessage; }
}