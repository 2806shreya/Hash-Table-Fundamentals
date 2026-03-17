import java.util.*;

class TokenBucket {
    int tokens;
    long last;

    TokenBucket(int max) {
        tokens = max;
        last = System.currentTimeMillis();
    }
}

public class RateLimiter {
    HashMap<String, TokenBucket> map = new HashMap<>();

    public boolean allow(String id) {
        map.putIfAbsent(id, new TokenBucket(1000));
        TokenBucket tb = map.get(id);

        if (tb.tokens > 0) {
            tb.tokens--;
            return true;
        }
        return false;
    }
}