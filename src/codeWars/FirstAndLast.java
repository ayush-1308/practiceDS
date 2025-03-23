package codeWars;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {2,2};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    public static int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int[] ans = new int[2];

        ans[0] = First(nums, target);
        ans[1] = Second(nums, target);
        return ans;
    }

    //Using Binary Search

    public static int First(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == target) {
                idx = mid;
            }
        }
        return idx;
    }

    public static int Second(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target) {
                idx = mid;
            }
        }
        return idx;
    }
}