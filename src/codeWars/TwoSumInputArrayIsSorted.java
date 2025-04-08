package codeWars;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSumInputArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {2,7,8,4};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        // creating a hashmap for storing and getting index
        HashMap<Integer, Integer> map = new HashMap<>();

        // target = 9, arr = {2,7,8,4}
        for(int i=0; i< numbers.length; i++){

            // num = 9 - 2 = 7;
            int num = target - numbers[i];
            if(map.containsKey(num)){
                return new int[]{map.get(num) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        return new int[]{-1, -1};
    }
}
