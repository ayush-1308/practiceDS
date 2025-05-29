package Practice.array;

public class LargestAltitude {
    public static void main(String[] args) {

    }
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length + 1];
        prefix[0] = gain[0];
        for (int i = 1; i < prefix.length - 1; i++) {
            prefix[i] = prefix[i - 1] + gain[i];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] > max) {
                max = prefix[i];
            }
        }
        return max;
    }
}
