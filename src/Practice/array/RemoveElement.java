package Practice.array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args){
        int[] arr = {10,20,30,40};
        System.out.println(removeElement(arr, 20));

        System.out.println(addElement(arr,50));

        System.out.println(remove(arr, 2));
    }

    public static int addElement(int[] arr, int value){
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = value;
        System.out.println(Arrays.toString(newArray));

        return newArray.length;
    }

    public static int removeElement(int[] arr, int num){
        int k = 0;

        for (int i = 0; i < arr.length - 1;  i++) {
            if(arr[i]!= num){
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return k;
    }

    public static int remove(int[] arr, int n){
        for (int i = n; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        System.out.println(Arrays.toString(arr));
        return arr.length - 1;
    }

}
