package NotificationSystem;

public class EmailNotificationStrategy
        implements NotificationStrategy {

    @Override
    public void send(String recipient, String message) {
        System.out.println(
                "Sending EMAIL to " + recipient +
                        " : " + message
        );
    }
}