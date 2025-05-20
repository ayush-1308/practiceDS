package Practice.array;

public class ContainerWithMOstWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maximumWater(height));
    }

    public static int maximumWater(int[] height){
        int left = 0;
        int right = height.length - 1;
        //System.out.println(right);

        int maxArea = 0;

        while(left < right) {
            int area = (right-left) * Math.min(height[left], height[right]);
            if(maxArea < area){
                maxArea = area;
            }
            if(height[left] >= height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }
}
