package codeWars;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHashmap {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] ans = twoSum(arr, 9);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length ; i++){
            int num = target - nums[i];
            if(map.containsKey(num)){
                return new int[]{map.get(num), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
