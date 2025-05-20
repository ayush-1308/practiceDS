package Practice.array;

import java.util.*;

public class IntersectionArrays {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4};
        int[] arr2= {3,4,5,4,3};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
