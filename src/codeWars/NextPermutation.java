package codeWars;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        nextPermutation(arr);
    }


    public static void nextPermutation(int[] nums) {

        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1] > nums[i]){
                secondLargest = largest;
                largest = nums[i+1];
            }
        }
        int temp = largest;
        largest = secondLargest;
        secondLargest = temp;

    }
}

/*

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
 */