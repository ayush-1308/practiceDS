package codeWars;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,7};
        System.out.println(summaryRanges(arr));
    }
    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> ans = new ArrayList<>();
        if (nums.length == 0) return ans;

        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
           if(nums[i] != nums[i-1] + 1){
               if(start == nums[i-1]){
                   ans.add(String.valueOf(start));
               }else {
                   ans.add(start + "->" + nums[i-1]);
               }
        start = nums[i];
           }

        }

        // this is for adding the last element as here start = 7 after updation in the upper loop and nums.length -1 is also 7
        // and it is a single no. so we will add it in the range...
        if (start == nums[nums.length - 1]) {
            ans.add(String.valueOf(start));
        } else {
            ans.add(start + "->" + nums[nums.length - 1]);
        }
        return ans;
    }
}

/*
You are given a sorted unique integer array nums.
A range [a,b] is the set of all integers from a to b (inclusive).
Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 */