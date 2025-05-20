package Practice.array;

public class FindMissingNo {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        findMissing(arr);
    }

    static void findMissing(int[] arr){
        int n = arr.length;
        int sum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i<arr.length; i++){
            actualSum+=arr[i];
        }
        System.out.println(sum-actualSum);
    }
}
