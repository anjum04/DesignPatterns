package NotificationSystem;

import java.time.Instant;

public class TokenBucket {

    private final int capacity;
    private final double refillRatePerMinute;

    private double tokens;
    private Instant lastRefillTime;

    public TokenBucket(
            int capacity,
            double refillRatePerMinute) {

        this.capacity = capacity;
        this.refillRatePerMinute = refillRatePerMinute;

        this.tokens = capacity;
        this.lastRefillTime = Instant.now();
    }

    public synchronized boolean allowRequest() {

        refill();

        if (tokens >= 1) {
            tokens--;
            return true;
        }

        return false;
    }

    private void refill() {

        Instant now = Instant.now();

        long elapsedMs =
                now.toEpochMilli()
                        - lastRefillTime.toEpochMilli();

        double minutes = elapsedMs / 60000.0;

        double tokensToAdd =
                minutes * refillRatePerMinute;

        tokens = Math.min(
                capacity,
                tokens + tokensToAdd
        );

        if (tokensToAdd > 0) {
            lastRefillTime = now;
        }
    }
}