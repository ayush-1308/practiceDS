package codeWars;

public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        System.out.println(check(arr));
    }
    public static boolean check(int[] nums) {

        int rotation = 0;
        if(nums.length == 0){
            return false;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i -1]){
               rotation++;
            }
        }
            if(rotation == 0){
                return true;
            } else if (rotation == 1) {
                return nums[nums.length - 1] <= nums[0];
                // nums[nums.length -1] = 4-1   i.e. nums[3] i.e 4 ;
                // nums[0] == 2;
                // 4 <= 2; false
            } else {
                return false;
            }
    }
}
