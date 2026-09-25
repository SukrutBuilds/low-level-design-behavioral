package structural.facade;

public class CoreLedgerService {
    public void recordTransaction(String userId, double amount, String transactionId) {
        System.out.println("[CoreLedger] Recording double-entry for user " + userId
                + ": debit " + amount + ", txn " + transactionId);
    }
}