package structural.facade;


public class NotificationService {
    public void sendReceipt(String userId, double amount) {
        System.out.println("[Notification] Sending receipt to user " + userId + " for amount " + amount);
    }
}