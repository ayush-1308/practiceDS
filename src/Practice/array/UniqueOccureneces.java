package Practice.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccureneces {
    public static void main(String[] args) {

    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        boolean result = true;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(!set.add(entry.getValue())) {
                return false;
            }
        }
        return result;
    }
}
