package codeWars;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDublicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean ans = containsDublicate(arr);
    }

    // USING HASHMAPS
    static boolean containsDublicate(int[] nums){
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
             //   System.out.println("true");
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    //USING SORT
//    public boolean containsDuplicate(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return false;
//        }
//        Arrays.sort(nums);
//        for(int i = 0; i< nums.length-1; ++i ){
//            if(nums[i] == nums[i+1]){
//                return true;
//            }
//        }
//        return false;
//    }
}
