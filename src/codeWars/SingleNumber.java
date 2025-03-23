package codeWars;

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }

    static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count occurrences of each number
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find the element that appears only once
        for (int num : nums) {
            if (freqMap.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }
}
