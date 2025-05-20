package Practice.array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        merge(arr1,3,arr2,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int idx = 0;

        int[] mergedArray = new int[m + n];
        while (i < m && j < n){
            if(nums1[i] <= nums2[j]){
                mergedArray[idx++] = nums1[i++];
            } else {
                mergedArray[idx++] = nums2[j++];
            }
        }
        while(i < m){
            mergedArray[idx++] = nums1[i++];
        }
        while(j < n){
            mergedArray[idx++] = nums2[j++];
        }
        for (int k = 0; k < m+n; k++) {
            nums1[k] = mergedArray[k];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
