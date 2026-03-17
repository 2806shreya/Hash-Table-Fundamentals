import java.util.*;

public class AnalyticsDashboard {
    HashMap<String, Integer> views = new HashMap<>();
    HashMap<String, Set<String>> users = new HashMap<>();

    public void process(String url, String user) {
        views.put(url, views.getOrDefault(url, 0) + 1);
        users.computeIfAbsent(url, k -> new HashSet<>()).add(user);
    }
}