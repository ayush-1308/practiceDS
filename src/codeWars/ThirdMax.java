package codeWars;

public class ThirdMax {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int ans = thirdMax(arr);
        System.out.println(ans);
    }

    static int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] > max){
                thirdMax = secondMax;
                secondMax = max;
                max = nums[j];
            } else if (nums[j] > secondMax && nums[j]!= max) {
                thirdMax = secondMax;
                secondMax = nums[j];
            } else if (nums[j] > thirdMax && nums[j]!= secondMax && nums[j]!= max) {
                thirdMax = nums[j];
            }
        }

        if(thirdMax == Long.MIN_VALUE){
            return (int) max;
        } else  {
            return (int) thirdMax;
        }
       // return thirdMax == Long.MIN_VALUE ? (int) max : (int) secondMax;
    }
}
