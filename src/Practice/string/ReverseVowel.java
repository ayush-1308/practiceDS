package Practice.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowel {
    public static void main(String[] args) {
        String s = "leetcode";
        ReverseVowel r = new ReverseVowel();
        System.out.println(r.reverseVowels(s));
    }

    public String reverseVowels(String string) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        char[] arr = string.toCharArray();
        int i = 0;
        int j = string.length()-1;
        while(i <= j) {
            if(set.contains(Character.toLowerCase(arr[i])) && set.contains(Character.toLowerCase(arr[j]))) {
                swap(arr, i, j);
                i++;
                j--;
            } else if(!set.contains(Character.toLowerCase(arr[i]))) {
                i++;
            } else if(!set.contains(Character.toLowerCase(arr[j]))){
                j--;
            }
        }
        return new String(arr);
    }
    public void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
