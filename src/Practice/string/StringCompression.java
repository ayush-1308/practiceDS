package Practice.string;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] ch = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(ch));
    }

    public static int compress(char[] chars) {
        int count = 1;
        int index = 0;

        if(chars.length < 1) {
            return chars.length;
        }

        for(int i = 1; i < chars.length; i++) {
            if(chars[i - 1] == chars[i]) {
                count++;
            } else if(chars[i - 1] != chars[i]) {
                chars[index++] = chars[i -1];
                if (count > 1) {
                    String countStr = Integer.toString(count);
                    for (char c : countStr.toCharArray()) {
                        chars[index++] = c;
                    }
                }
                count = 1;
            }
        }
        chars[index++] = chars[chars.length - 1];
        if (count > 1) {
            String countStr = Integer.toString(count);
            for (char c : countStr.toCharArray()) {
                chars[index++] = c;
            }
        }

        return index;
    }
}
