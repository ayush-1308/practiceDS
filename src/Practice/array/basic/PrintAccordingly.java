package Practice.array.basic;

import java.util.*;

public class PrintAccordingly {

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,4,5,8,5,3,6,3};
        print(arr);
    }

    public static void print(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        list.sort(Comparator.comparingInt(map::get));
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
