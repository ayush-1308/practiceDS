package codeWars;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        SearchInRotatedArray search = new SearchInRotatedArray();
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int[] arr1 = {1, 3};
        int ans = search.search(arr1, 3);
        System.out.println(ans);
    }

//    public int search(int[] nums, int target) {
//        int pivot = 0;
//
//        if (nums.length == 0) return -1;
//        if (nums.length == 1) return nums[0] == target ? 0 : -1;
//
//        // Find the pivot
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i + 1] < nums[i]) {
//                pivot = i + 1;
//                break;
//            }
//        }
//
//        int start, end;
//        if (target >= nums[pivot] && target <= nums[nums.length - 1]) {
//            start = pivot;
//            end = nums.length - 1;
//        } else {
//            start = 0;
//            end = pivot - 1;
//        }
//
//        // Binary search
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (nums[mid] == target) return mid;
//            else if (target < nums[mid]) end = mid - 1;
//            else start = mid + 1;
//        }
//
//        return -1;
//    }
//}


    public int search(int[] nums, int target) {
        int pivot = 0;

        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0] == target ? 0 : -1;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1] < nums[i]){
                pivot = i+1;
                break;
            }
        }
        int start;
        int end;
        if (target >= nums[pivot] && target <= nums[nums.length - 1]){
            start = pivot;
            end = nums.length -1 ;
        } else {
            start = 0;
            end = pivot - 1;
        }

        while (start <= end){
            int mid = start + (end - start)/2;
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}


