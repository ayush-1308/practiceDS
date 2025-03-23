package codeWars;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr= {-1,2,-8,-10};
        arr = sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] sortArray(int[] nums) {
        if(nums.length == 1){
            return nums;
        }
        int mid = nums.length/2;;
        int[] leftSide = sortArray(Arrays.copyOfRange(nums, 0, mid));
        int[] rightSide = sortArray(Arrays.copyOfRange(nums, mid, nums.length));

        return mergeSort(leftSide, rightSide);
    }

    //using merge sort and recursion....
    private static int[] mergeSort(int[] first, int[] second){
        int[] newArray = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int size = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                newArray[size] = first[i];
                i++;
            }else{
                newArray[size] = second[j];
                j++;
            }
            size++;
        }

        while(i < first.length){
            newArray[size] = first[i];
            i++;
            size++;
        }
        while(j < second.length){
            newArray[size] = second[j];
            j++;
            size++;
        }
        return newArray;
    }
 }
