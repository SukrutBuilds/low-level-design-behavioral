package structural.bridge;

/** IMPLEMENTOR interface - the "how" side of the bridge. */
public interface NotificationChannel {
    void send(String recipient, String message);
}