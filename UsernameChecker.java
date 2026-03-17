import java.util.*;

public class UsernameChecker {
    private HashMap<String, Integer> users = new HashMap<>();
    private HashMap<String, Integer> attempts = new HashMap<>();

    public boolean checkAvailability(String username) {
        attempts.put(username, attempts.getOrDefault(username, 0) + 1);
        return !users.containsKey(username);
    }

    public List<String> suggest(String username) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            res.add(username + i);
        }
        return res;
    }

    public String mostAttempted() {
        return Collections.max(attempts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}