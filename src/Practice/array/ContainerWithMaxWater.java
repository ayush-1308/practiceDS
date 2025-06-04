package Practice.array;

public class ContainerWithMaxWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max= Integer.MIN_VALUE;
        while(left <= right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            if(area > max) {
                max = area;
            }
            if(height[right] < height[left]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}
