package Practice.array;

import java.util.Arrays;

public class MinMaxDifference {

    public static void main(String[] args) {
        int num = 11891;
        System.out.println(minMaxDifference(num));
    }

    public static int minMaxDifference(int num) {
        String str = Integer.toString(num);
        StringBuilder max = new StringBuilder();
        StringBuilder min = new StringBuilder();
        int n = str.length();
        char ele = ' ';

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != '9') {
                ele = str.charAt(i);
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ele) {
                max.append('9');
            } else {
                max.append(str.charAt(i));
            }
        }

        char first = str.charAt(0);
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == first) {
                min.append('0');
            } else {
                min.append(str.charAt(i));
            }
        }

        int maxVal = Integer.parseInt(max.toString());
        int minVal = Integer.parseInt(min.toString());
        return maxVal - minVal;
    }
}
