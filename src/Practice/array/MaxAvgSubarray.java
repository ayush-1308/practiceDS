package Practice.array;

public class MaxAvgSubarray {
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(arr, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        if(nums.length == 1) {
            return nums[0];
        }
        int i = 0;
        int j = 0;
        double average = Double.NEGATIVE_INFINITY;
        int sum = 0;
        while(j != nums.length) {
            sum+= nums[j];
            if((j - i + 1) == k) {
                double avg = (double) sum /k;
                if(average < avg) {
                    average = avg;
                }
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return average;
    }
}
