package codeWars;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        sortColors(arr);
    }

    static void sortColors(int[] nums){
        int left= 0;
        int mid = 0;
        int right = nums.length-1;

        while(mid <= right){
            if(nums[mid] == 0){
                swap(nums, mid, left);
                left++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else {
                swap(nums, mid, right);
                right--;
            }
        }

    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    static void sortColors(int[] nums) {
//        int left = 0;
//        int right = nums.length-1;
//        int mid = nums.length/2;
//        while (left < right){
//            if(nums.length == 3){
//                if(nums[mid] == 0){
//                    int temp = nums[mid];
//                    nums[mid] = nums[mid-1];
//                    nums[mid-1] = temp;
//                    break;
//                }
//            }else {
//                if (nums[left] == nums[right]) {
//                    right--;
//                }
//                if (nums[left] > nums[right]) {
//                    int temp = nums[left];
//                    nums[left] = nums[right];
//                    nums[right] = temp;
//                }
//                left++;
//            }
//        System.out.println(Arrays.toString(nums));
//            }
//        }
    }


/*

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
 */