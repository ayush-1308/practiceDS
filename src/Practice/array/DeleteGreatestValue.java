package Practice.array;

import java.util.ArrayList;
import java.util.List;

public class DeleteGreatestValue {
    public static void main(String[] args) {

    }

    public int deleteGreatestValue(int[][] grid) {
    int answer = 0;
    int max = Integer.MIN_VALUE;
    List<Integer> list = new ArrayList<>();
        for(int i = 0; i < grid.length; i++) {
        for(int j = 0; j < grid[0].length; j++) {
            if(max < grid[i][j]) {
                max = grid[i][j];
            }
            if(j == grid[0].length - 1) {
                list.add(max);
            }
        }
        for(int num : list) {
                answer+= num;
            }
        }
        return answer;
    }
}
