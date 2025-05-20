package Practice.array;

public class MinimumSizeSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, arr));
    }
    public static int minSubArrayLen(int target, int[] nums) {
       int left = 0, right = 0;
       int sum = 0;
       int index = Integer.MAX_VALUE;
       while(left <= right && right != nums.length){
           sum = add(nums, left, right);
           if(sum < target){
               right++;
           } else if(sum >= target){
               index = Math.min(index, right-left + 1);
               left++;
           }
       }
       return index;
    }

    public static int add(int[] arr, int left, int right){
       int sum = 0;
        for (int i = left; i <= right ; i++) {
          sum+= arr[i];
        }
        return sum;
    }
}

/*
GPT's code
public static int minSubArrayLen(int target, int[] nums) {
    int left = 0, right = 0;
    int sum = 0;
    int index = Integer.MAX_VALUE;

    while (right < nums.length) {
        sum += nums[right]; // grow the window by including nums[right]

        // shrink the window from the left as long as sum >= target
        while (sum >= target) {
            index = Math.min(index, right - left + 1);
            sum -= nums[left];
            left++;
        }

        right++; // move right to expand the window
    }

    return index == Integer.MAX_VALUE ? 0 : index;
}
 */
