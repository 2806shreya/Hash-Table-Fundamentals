import java.util.*;

public class AutocompleteSystem {
    HashMap<String, Integer> freq = new HashMap<>();

    public void add(String query) {
        freq.put(query, freq.getOrDefault(query, 0) + 1);
    }

    public List<String> search(String prefix) {
        List<String> res = new ArrayList<>();
        for (String q : freq.keySet()) {
            if (q.startsWith(prefix)) res.add(q);
        }
        return res;
    }
}
    

