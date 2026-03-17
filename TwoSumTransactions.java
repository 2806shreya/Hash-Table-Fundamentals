import java.util.*;

public class TwoSumTransactions {
    public List<int[]> twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<int[]> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) {
                res.add(new int[]{comp, arr[i]});
            }
            map.put(arr[i], i);
        }
        return res;
    }
}
