package Practice.array;

public class IncreasingTriplet334 {
    public static void main(String[] args) {
        int[] arr = {20,100,10,12,5,13};
        System.out.println(increasingTriplet(arr));
    }

    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i : nums) {
            if(i <= first) {
                first = i;
            } else if(i < second) {
                second = i;
            } else if(i > second){
                return true;
            }
        }
        return false;

        // int count = 0;
        // int max = Integer.MIN_VALUE;
        // for(int i = 1; i < nums.length; i++) {
        //     if(max > nums[i]) {
        //         max = nums[i];
        //     } else {
        //         count++;
        //     }
        // }
        // if(count >= 3) {
        //     return true;
        // }
        // return false;

        // for(int i = 1; i < nums.length - 1; i++) {
        //     if(nums[i] > nums[i-1] && nums[i] < nums[i+1]) {
        //         return true;
        //     }
        // }
        // return false;
    }
}
