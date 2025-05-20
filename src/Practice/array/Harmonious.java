package Practice.array;

import java.util.HashMap;
import java.util.Map;

public class Harmonious {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(arr));
    }

    public static int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int maxSum = 0;
        for(int num : map.keySet()) {
            if(map.containsKey(num + 1)) {
                int currentSum = map.get(num) + map.get(num+1);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
    return maxSum;
    }

}
