package Practice.array;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
            int[] nums1 = {4,1,2};
            int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            int index = -1;
            for(int j = 0; j < nums2.length; j++) {
                if(nums2[j] == nums1[i]) {
                    index = j;
                    break;
                }
            }
            int greater = -1;
            for(int k = index + 1; k < nums2.length; k++) {
                if(nums2[k] > nums1[i]){
                    greater = nums2[k];
                    break;
                }
            }
            ans[i] = greater;
        }
        return ans;
    }
}
