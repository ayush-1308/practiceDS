package Practice.array;

public class FindLength {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2,3,4,5};
        System.out.println(findLengthOfLCIS(arr));
    }

    public static int findLengthOfLCIS(int[] nums) {
        int count =0;
        int curr = 0;
        for(int i= 0; i< nums.length-1; i++){
            if(nums[i] >= nums[i+1]){
                if(count < curr) {
                    count = curr;
                }
                curr = 0;
            } else {
                curr++;
            }
        }
        if(count < curr) {
            count = curr;
        }
        return count+1;
    }
}
