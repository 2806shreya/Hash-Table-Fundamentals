import java.util.*;

public class MultiLevelCache {
    LinkedHashMap<String, String> L1 = new LinkedHashMap<>(100, 0.75f, true);
    HashMap<String, String> L2 = new HashMap<>();

    public String get(String key) {
        if (L1.containsKey(key)) return "L1 HIT";
        if (L2.containsKey(key)) {
            L1.put(key, L2.get(key));
            return "L2 HIT";
        }
        return "DB HIT";
    }
}