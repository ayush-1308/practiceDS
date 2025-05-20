package Practice.string;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctString {

    public static void main(String[] args) {
        String[] string = {"a","b","a"};
        System.out.println(kthDistinct(string, 3));
    }

    public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        String ans = "";
        int count = 0;
        for(String s : arr) {
            if (map.get(s) == 1) {
                count++;
                if(count == k) {
                    ans = s;
                }
            }
        }
        return ans;
    }
}
