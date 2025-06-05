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

        int i = 0;
        int j = 0;
        int count = 0;
        while(j <= s.length()) {
            if(set.contains(s.charAt(j))) {
                count++;
            } else {
                i = j;
                count = 0;
            }
            if(count == k) {
                return k;
            }
            j++;
        }
        return count;
    }
}
