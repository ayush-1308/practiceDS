package codeWars;

import java.util.Arrays;

public class MovingZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 5};
        moveZeroes(arr);
    }

    static void moveZeroes(int[] nums) {
        // two pointer;
        int left = 0; // pointer for zeroes

        for (int right = 0; right < nums.length; right++) {
            if(nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++; //  Increment the left pointer to mark the next position where a non-zero element should be moved.
            }
        }
                System.out.println(Arrays.toString(nums));
    }
}
