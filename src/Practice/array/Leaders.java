package Practice.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 1, 2};
        System.out.println(leaders(arr));
    }

    public static ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[nums.length-1]);

        for(int i = nums.length - 1; i > 0; i--) {
            if(nums[i-1] > nums[i]) {
                list.add(nums[i-1]);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
