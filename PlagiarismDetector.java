
import java.util.*;

public class PlagiarismDetector {
    private HashMap<String, Set<String>> map = new HashMap<>();

    public void addDocument(String docId, String text) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length - 2; i++) {
            String gram = words[i] + words[i+1] + words[i+2];
            map.computeIfAbsent(gram, k -> new HashSet<>()).add(docId);
        }
    }
}