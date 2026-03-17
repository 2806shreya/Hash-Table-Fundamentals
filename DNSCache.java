import java.util.*;

class DNSEntry {
    String ip;
    long expiry;

    DNSEntry(String ip, long ttl) {
        this.ip = ip;
        this.expiry = System.currentTimeMillis() + ttl;
    }
}

public class DNSCache {
    private HashMap<String, DNSEntry> cache = new HashMap<>();

    public String resolve(String domain) {
        if (cache.containsKey(domain)) {
            DNSEntry e = cache.get(domain);
            if (System.currentTimeMillis() < e.expiry) {
                return e.ip + " (HIT)";
            }
        }
        String ip = "1.1.1.1"; // mock
        cache.put(domain, new DNSEntry(ip, 5000));
        return ip + " (MISS)";
    }
}