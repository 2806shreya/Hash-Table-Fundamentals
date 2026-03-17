import java.util.*;

public class FlashSaleInventory {
    private HashMap<String, Integer> stock = new HashMap<>();
    private Queue<Integer> waitlist = new LinkedList<>();

    public void addProduct(String id, int qty) {
        stock.put(id, qty);
    }

    public synchronized String purchase(String id, int userId) {
        int s = stock.getOrDefault(id, 0);
        if (s > 0) {
            stock.put(id, s - 1);
            return "Success";
        } else {
            waitlist.add(userId);
            return "Added to waitlist";
        }
    }
}