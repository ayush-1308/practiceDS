package codeWars;

import java.util.Arrays;

public class SecondLargest_and_SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(getSecondOrderElements(6,arr)));
    }

    public static int[] getSecondOrderElements(int n, int []a) {
        if(n<2){
            return new int[]{-1,-1};
        }

//        // Initialize variables
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;  //23236678
        int secondMin = Integer.MAX_VALUE;

//        int max = 0;
//        int secondMax = 0;
//        int min = 0;
//        int secondMin = 0;

        for (int i = 0; i < n; i++) {
            if(a[i] > max){
                secondMax = max;
                max = a[i];
            }else if (a[i] > secondMax && a[i]!= max) {
                secondMax = a[i];
            }

            if (a[i] < min) {
                secondMin = min;
                min = a[i];
            } else if (a[i] < secondMin && a[i]!= min) {
                secondMin = a[i];
            }
        }
        return new int[]{secondMax, secondMin};
    }

}
