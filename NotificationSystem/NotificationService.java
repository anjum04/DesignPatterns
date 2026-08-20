package NotificationSystem;

public class NotificationService {

    private final RateLimiter rateLimiter;

    public NotificationService(RateLimiter rateLimiter) {
        this.rateLimiter = rateLimiter;
    }

    public void sendNotification(
            String userId,
            NotificationType type,
            String recipient,
            String message) {

        // 1. Rate limiting
        if (!rateLimiter.allow(userId)) {
            throw new RuntimeException(
                    "Rate limit exceeded for user: " + userId
            );
        }

        // 2. Select strategy
        NotificationStrategy strategy =
                getStrategy(type);

        // 3. Send notification
        strategy.send(recipient, message);
    }

    private NotificationStrategy getStrategy(
            NotificationType type) {

        return switch (type) {

            case EMAIL ->
                    new EmailNotificationStrategy();

            case SMS ->
                    new SmsNotificationStrategy();

            case PUSH ->
                    new PushNotificationStrategy();
        };
    }
}