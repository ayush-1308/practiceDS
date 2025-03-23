package codeWars;

public class SubarraySumKdanes {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    // This is Kdane's Algorithm

    /*
    Initialize:

maxSum = Integer.MIN_VALUE (stores the maximum subarray sum).
currentSum = 0 (tracks the current subarray sum).
Iterate through the array:

Add the current element to currentSum.
If currentSum > maxSum, update maxSum.
If currentSum becomes negative, reset it to 0 (ignore negative sums).
Return maxSum at the end.
     */
    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
