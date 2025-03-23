package codeWars;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (map.get(num) > n / 2) {
                //System.out.println(map.get(num));
                return num;
            }
        }
        //System.out.println(map);
        return -1;
    }
}

/*
map.put(nums[i], map.getOrDefault(nums[i], 0) + 1), which:
Checks if the number exists in the map.
If it exists, increases the count.
If it doesn’t exist, initializes it to 1
 */

/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
 */