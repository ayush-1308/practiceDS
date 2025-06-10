package Practice.array;

import java.util.*;

public class FindDifference {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int n: nums1) {
            set1.add(n);
        }
        for(int n: nums2) {
            set2.add(n);
        }

        for(int i : nums2) {
            if(set1.contains(i)) {
                set2.remove(i);
                set1.remove(i);
            }
        }

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(set1));
        list.add(new ArrayList<>(set2));

        return list;
    }
}
