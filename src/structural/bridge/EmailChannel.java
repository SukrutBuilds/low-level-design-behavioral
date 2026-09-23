package structural.bridge;

public class EmailChannel implements NotificationChannel {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[Email to " + recipient + "]: " + message);
    }
}