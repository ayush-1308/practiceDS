package Practice.array.basic;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
       System.out.println(maxElement(arr));
        System.out.println(minElement(arr));
    }

    public static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
    return max;
    }

    public static int minElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
