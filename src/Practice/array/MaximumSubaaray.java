package Practice.array;

public class MaximumSubaaray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }


    //SLIDING WINDOW ALGORITHM DOES NOT WORK ON ARRAYS CONTAINING NEGATIVE NUMBERS

    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int sum = Integer.MIN_VALUE;
        for(int num: nums){
            currentSum += num;

            if (currentSum > sum){
                sum = currentSum;
            }

            if (currentSum < 0){
                currentSum = 0;
            }
        }
        return sum;
    }
}
