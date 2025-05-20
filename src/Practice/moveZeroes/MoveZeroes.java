package Practice.moveZeroes;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes move = new MoveZeroes();
        int[] arr = {0,1,0,3,12};
        move.moveZeroes(arr);
    }

    public void moveZeroes(int[] num){
       int left = 0;
        for (int right = 0; right < num.length; right++) {
            if(num[right] != 0){
                int temp = num[right];
                num[right] = num[left];
                num[left] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
