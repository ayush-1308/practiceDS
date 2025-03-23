package codeWars;

import java.util.Arrays;
import java.util.Map;

public class Candy {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,1};
        System.out.println(candy(arr));
    }

    public static int candy(int[] ratings) {
        int count = ratings.length;
        int[] arr = new int[count];
        Arrays.fill(arr, 1);

        // i.e 3 > 1 so, arr[i]: arr[i-1] + 1; arr[1] = 1 + 1;
        for (int i = 1; i < count ; i++) {
            if (ratings[i] > ratings[i-1]){
                arr[i] = arr[i-1] + 1;
            }
        }

        //i.e arr[i] = 2, arr[i+1] = 1
        for (int i = count-2; i >= 0; i--) {
            if (ratings[i] > ratings[i+1]) {
                arr[i] = Math.max(arr[i], arr[i+1] + 1);
            }
        }

        int sum = 0;
        for (int j : arr) {
            sum += j;
        }

        return  sum;
    }
}
