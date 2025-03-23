package codeWars;

import java.util.Arrays;
import java.util.HashMap;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,3};
        int[] ans = new int[]{missingNumber(arr)};
    }

    private static int missingNumber(int[] nums){
        HashMap <Integer, Boolean> map = new HashMap<>();
        for (int num : nums){
            map.put(num, true);
        }

        for (int i = 0; i < nums.length ; i++) {
            if (!map.containsKey(i)){
      //  System.out.println(i);
                return i;
            }
        }
        return -1;
    }

//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int index = 0;
//        for (int num : nums) {
//            if (index != num) {
//                return index;
//            } else {
//                index++;
//            }
//        }
//        return index;
//    }
}
