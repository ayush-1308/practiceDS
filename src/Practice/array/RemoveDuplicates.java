package Practice.array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) throws Exception {

        /*
        try {
        int[] arr = {1,1,2};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
        } catch (Exception e){
            System.out.println("Exception Occured!!!" + e);
        }
        */
        int[] arr = {1,1,1,2,2};
        int ans = removeDuplicates2(arr);
        System.out.println(ans);

        //assert k == expectedNums.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int removeDuplicates(int[] nums){
        int n = nums.length;
        int j = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i-1] != nums[i]){
                nums[j] = nums[i];
                j++;
            }
        }
        //Arrays.sort();
        return j;
    }

    public static int removeDuplicates2(int[] nums) {
        int i = 2;

        if(nums.length < 2){
            return nums.length;
        }

        for(int j = 2; j < nums.length; j++){
            if(nums[j-2] != nums[j]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }


}

/*
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
 */