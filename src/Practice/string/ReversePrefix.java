package Practice.string;

import java.util.Arrays;

public class ReversePrefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        System.out.println(reversePrefix(word, 'd'));
    }
    public static String reversePrefix(String word, char ch) {
        int left = 0;
        int right = 0;
        char[] c = word.toCharArray();
        for(int i = 0; i < c.length; i++){
            if(c[i] == ch){
                right = i;
                break;
            }
        }
        swap(c, left, right);
        String str = new String(c);
        return str;
    }

    public static void swap(char[] c, int left, int right){
        while(left < right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
    }
}
