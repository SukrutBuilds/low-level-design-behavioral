package structural.bridge;

public class PushNotificationChannel implements NotificationChannel {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[Push to " + recipient + "]: " + message);
    }
}