package codeWars;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        //int[] arr = {1,0,1,1,0,1};
        //System.out.println(findMaxConsecutiveOnes(arr));
        String s = "abbcccddddeeeeedcba";
        System.out.println(maxPower(s));
    }

    //leetcode; output = 2
    //USing SlIding Window
    static int maxPower(String s) {
        int length = s.length();
        int maxCount= 0;
        int currentCount = 0;
        for (int i = 0; i < length-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)){
                currentCount++;
            }else {
                currentCount = 0;
            }
            if (currentCount > maxCount){
                maxCount = currentCount;
            }
        }
            maxCount = maxCount + 1;
            return maxCount;
    }

    // USING SLIDING WINDOW
    static int findMaxConsecutiveOnes(int[] nums) {
        int maxSum = 0;
        int currentSum = 0;

        for (int num : nums) {
            if (num == 1) {
                currentSum++;
            } else {
                currentSum = 0;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
