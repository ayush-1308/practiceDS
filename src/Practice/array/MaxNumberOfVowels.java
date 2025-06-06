package Practice.array;

import java.util.HashSet;
import java.util.Set;

public class MaxNumberOfVowels {
    public static void main(String[] args) {
        String s = "abciiidef";
        System.out.println(maxVowels(s, 3));
    }

    public static int maxVowels(String s, int k) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int current = 0;
        int max = 0;
        for(int i = 0; i < k; i++) {
            if(set.contains(s.charAt(i))) {
                current++;
            }
        }

        max = current;
        for(int i = k; i < s.length(); i++) {
            if(set.contains(s.charAt(i - k))) {
                current--;
            }
            if(set.contains(s.charAt(i))) {
                current++;
            }
            max = Math.max(current, max);
        }
        return max;
    }
}
