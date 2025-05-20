package Practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrefixSum {
    public static void main(String[] args) {
       // int[] arr = {2, 4, 1, 3, 5};
       // prefixSum(arr);

        int[] arr1 = {1,1,1};
        System.out.println(subarraySum(arr1,2));
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0, prefixSum = 0;
        Map<Integer, Integer> sumFreq = new HashMap<>();
        sumFreq.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            if (sumFreq.containsKey(prefixSum - k)) {
                count += sumFreq.get(prefixSum - k);
            }
            sumFreq.put(prefixSum, sumFreq.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void prefixSum(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(prefix));
    }
}