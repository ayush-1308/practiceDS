package Practice.string;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWordInString {

    public static void main(String[] args) {
        String s = " hello world ";
        System.out.println(reverseWrds(s));
    }

    public static String reverseWrds(String s){
        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }

        return sb.toString().trim();
    }

    public static String reverseWords(String s) {
        s.trim();
        String[] words = s.split("\\s+");
        Collections.reverse(Arrays.asList(words));

        String result = String.join(" ", words);
        result.trim();
        return result;
    }

}
