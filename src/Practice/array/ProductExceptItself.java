package Practice.array;

import java.util.Arrays;

public class ProductExceptItself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] result = new int[nums.length];
        int res = 1;
        left[0] = 1;
        right[nums.length - 1] = 1;
        for(int i = 1; i < nums.length; i++) {
            res *= nums[i-1];
            left[i] = res;
        }

        System.out.println(Arrays.toString(left));

        int ans = 1;
        for(int i = nums.length-2; i>=0; i--) {
            ans *= nums[i+1];
            right[i] = ans;
        }

        System.out.println(Arrays.toString(right));

        for(int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}
