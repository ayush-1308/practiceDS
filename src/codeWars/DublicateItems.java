package codeWars;

import java.util.Arrays;

public class DublicateItems {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};
        System.out.println(removeDuplicates(arr, 6));
    }
    public static int removeDuplicates(int[] arr,int n) {
        int pos = 0;
        for(int i = 1; i< n; i++){
            if(arr[i] != arr[pos]){
                arr[++pos] = arr[i];
            }
        }
        return pos+1;
    }
}
