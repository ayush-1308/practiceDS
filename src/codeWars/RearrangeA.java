package codeWars;

import java.util.Arrays;

public class RearrangeA {

    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];

        // Using Two Pointer approach
        // positive = 0 (0 because the positive no. should be at even indexes)
        // negative = 1 (1 because the negative no. should be at odd places)

        int positive = 0;
        int negative = 1;

        for(int i = 0; i < result.length; i++){
            if(nums[i] >= 0){
                result[positive] = nums[i];
                positive += 2;
            }else {
                result[negative] = nums[i];
                negative += 2;
            }
        }
    return result;
    }
}
