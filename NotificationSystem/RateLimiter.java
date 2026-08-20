package NotificationSystem;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimiter {

    private final Map<String, TokenBucket> buckets =
            new ConcurrentHashMap<>();

    private final int capacity;
    private final double refillRatePerMinute;

    public RateLimiter(
            int capacity,
            double refillRatePerMinute) {

        this.capacity = capacity;
        this.refillRatePerMinute = refillRatePerMinute;
    }

    public boolean allow(String userId) {

        TokenBucket bucket =
                buckets.computeIfAbsent(
                        userId,
                        id -> new TokenBucket(
                                capacity,
                                refillRatePerMinute
                        )
                );

        return bucket.allowRequest();
    }
}