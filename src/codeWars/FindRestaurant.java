package codeWars;

import java.util.*;

public class FindRestaurant {
    public static void main(String[] args) {
        String[] arr1 = {"Shogun","Piatti","Tapioca Express","Burger King","KFC"};
        String[] arr2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] ans = findRestaurant(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int sum = map.get(list2[j]) + j;

                if (sum < minSum) {
                    minSum = sum;
                    result.clear();
                    result.add(list2[j]);
                } else if (sum == minSum) {
                    result.add(list2[j]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
/*
int count = Integer.MAX_VALUE;
        LinkedHashSet<String> ans = new LinkedHashSet<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (Objects.equals(list1[i], list2[j])){
                    int sum = i + j;
                    if (sum < count) {
                        count = sum;
                        ans.add(list2[j]);
                    }
                    if (sum == count){
                        ans.add(list2[j]);
                    }
                }
            }
        }
        return ans.toArray(new String[0]);
    }
 */