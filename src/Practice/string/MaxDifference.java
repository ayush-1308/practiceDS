package Practice.string;

import java.util.HashMap;
import java.util.Map;

public class MaxDifference{

    public static void main(String[] args) {
        String s = "tzt";
        System.out.println(maxDifference(s));
    }

    public static int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i= 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+ 1);
        }

        System.out.println(map);
        int odd = Integer.MIN_VALUE;
        int even = Integer.MAX_VALUE;
        int result = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                even = Math.min(even, entry.getValue());
            } else {
                odd = Math.max(odd,entry.getValue());
            }
            System.out.println("Even :" + even);
            System.out.println("odd : " + odd);
            result = odd - even;
            System.out.println("res: " + result);
        }
        return result;
    }
}
