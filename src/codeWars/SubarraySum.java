package codeWars;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr= {-1,-1,1};
        System.out.println(subarraySum(arr, 0));
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0, prefixSum = 0;
        HashMap<Integer, Integer> sumFreq = new HashMap<>();
        sumFreq.put(0, 1); // Initialize with prefix sum 0

        for (int num : nums) {
            prefixSum += num; // Update prefix sum

            // Check if there exists a subarray with sum k
            if (sumFreq.containsKey(prefixSum - k)) {
                count += sumFreq.get(prefixSum - k);
            }

            // Update prefix sum frequency
            sumFreq.put(prefixSum, sumFreq.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}

/*
Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
 */
