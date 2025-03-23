package codeWars;

import java.util.ArrayList;
import java.util.List;

public class MergeTwo2DArrays {
    public static void main(String[] args) {

    }
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();

        int l1 = nums1.length;
        int l2 = nums2.length;

        // using two pointer method
        int p1 = 0;
        int p2 = 0;

        while(p1 < l1 && p2 < l2){
            int[] row1 = nums1[p1];
            int[] row2 = nums2[p2];

            if (row1[0] == row2[0]){
                list.add(new int[]{row1[0], row1[1] + row2[1]});
                p1++;
                p2++;
            } else {
                if (row1[0] < row2[0] ) {
                    list.add(row1);
                    p1++;
                }else {
                    list.add(row2);
                    p2++;
                }
            }
        }
        while (p1 < l1){
            list.add(nums1[p1]);
            p1++;
        }
        while (p2 < l2){
            list.add(nums2[p2]);
            p2++;
        }
        int[][] res=new int[list.size()][2];
        int idx=0;

        for(var row:list){  // using 'var' keyword as it automatically detects datatype
            res[idx++]=row;
        }
        return res;
    }
}
