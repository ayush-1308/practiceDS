package Practice.array;

public class Jumpgame {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {

        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > count) {
                return false;
            }
            count = Math.max(count, nums[i] + i);
        }
        return true;

//        int i = 0;
//        int jump = 0;
//        while(i < nums.length) {
//            jump = nums[i];
//            i+=jump;
//            if(jump >= nums[nums.length-1] || jump >= nums.length-1) {
//                return true;
//            }
//            if(jump == 0) {
//                return false;
//            }
//        }
//        return false;
    }
}
