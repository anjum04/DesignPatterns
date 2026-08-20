package NotificationSystem;

public interface NotificationStrategy {

    void send(String recipient, String message);

}