package codeWars;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        nextPermutation(arr);
    }


    public static void nextPermutation(int[] nums) {
        int i = nums.length -2;
        while (i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        if(i>=0){
            int j = nums.length - 1;
            while (j>=0 && nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length - 1);
    }

    static void swap(int[] arr, int n1, int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

    static void reverse(int[] arr, int start, int end){
        while(start < end){
            swap(arr, start, end);
            end--;
            start++;
        }
    }
}

/*

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
 */