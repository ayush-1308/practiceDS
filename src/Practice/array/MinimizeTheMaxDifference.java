package Practice.array;

import java.util.Arrays;

public class MinimizeTheMaxDifference {
    public static void main(String[] args) {

    }

    public int minimizeMax(int[] nums, int p) {
        if(p == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int left = 0;
        int right = nums[nums.length - 1] - nums[0];

        while(left < right) {
            int mid = left + (right - left)/2;
            int count = 0;

            for(int i = 1; i < nums.length; ++i) {
                if(nums[i] - nums[i-1] <= mid) {
                    count++;
                    ++i;
                }
            }
            if(count >= p) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
