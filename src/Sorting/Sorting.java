package Sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        //insertion(arr);
       // bubble(arr);
        selection(arr);
    }

    public static void heapSort(int[] arr, int n) {
        if(n<2) {
            return;
        }
        int lastParent = n/2 -1;

        while(lastParent >=0) {
            int left = 2 * lastParent + 1;
            int right = 2 * lastParent + 2;
            int mx = left;
            if(right < n && arr[right] > arr[mx]) {
                mx = right;
            }
            if(arr[mx] > arr[lastParent]) {
                int temp = arr[mx];
                arr[mx] = arr[lastParent];
                arr[lastParent] = temp;
            }
            lastParent--;
        }

        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;

        heapSort(arr, n-1);
    }

    public static void mergeSort() {

    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMax(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        System.out.println(Arrays.toString(arr));
    }

    static int getMax(int[] arr, int first, int last){
        int max = first;
        for (int i = first; i <= last ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return  max;
    }

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
