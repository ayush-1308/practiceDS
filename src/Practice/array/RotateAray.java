package Practice.array;

import java.util.Arrays;

public class RotateAray {

    public static void main(String[] args) {
        RotateAray rotate = new RotateAray();

        int[] arr = {1,2,3,4,5,6,7};
       // System.out.println(arr.length);
        rotate.rotate(arr, 3);
    }
    public void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    public void reverse(int[] arr,int left, int right){
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
