package Practice.array;

public class FindPivotIndex {

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(findPivot(nums));
    }

    public static int findPivot(int[] nums) {
        int[] prefixL = new int[nums.length];
        prefixL[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixL[i] = prefixL[i - 1] + nums[i];
        }

        int[] prefixR = new int[nums.length];
        prefixR[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            prefixR[i] = nums[i] + prefixR[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (prefixL[i] == prefixR[i]) {
                return i;
            }
        }
        return -1;
    }
}
