package Practice.array;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = {-100,-2,-3,1};
        System.out.println(maximumProduct(arr));
    }

    public static int maximumProduct(int[] nums) {
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = 0; j < nums.length - 1; j++) {
//                if(Math.abs(nums[j]) > Math.abs(nums[j+1])) {
//                    int temp = nums[j];
//                    nums[j] =  nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
//        }












        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        int n = nums.length;
        int res1 = nums[n-1] * nums[n-2] * nums[n-3];
        int res2 = nums[0] * nums[1] * nums[n-1];
        return Math.max(res1, res2);
     //   return Math.max((nums[n-1] * nums[n-2] * nums[n-3]), (nums[0] * nums[1] * nums[2]));
    }

//    public int maximumProduct(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        return Math.max((nums[n-1] * nums[n-2] * nums[n-3]), (nums[0] * nums[1] * nums[n-1]));
//    }
}
