package codeWars;

import java.util.Arrays;
import java.util.HashMap;

public class threeSum {
    public static void main(String[] args) {
    int[] arr = {-1, 1, 2, -4};
    int ans = threeSumClosest(arr, 1);
        System.out.println(ans);
    }

    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int sum = 0;
        int left = 0;
        int right = nums.length -1;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + nums[left] + nums[right];
            if(sum < target){
                left++;
            } else if (sum > target){
                right--;
            }
        }
        return sum;
    }
}
