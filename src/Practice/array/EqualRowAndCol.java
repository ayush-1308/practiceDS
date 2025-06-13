package Practice.array;

public class EqualRowAndCol {

    public static void main(String[] args) {
        int[][] grid = { {3,1,2,2}
                        ,{1,4,4,5}
                        ,{2,4,2,2},
                         {2,4,2,2}};
        EqualRowAndCol ans = new EqualRowAndCol();
        int res = ans.equalPairs(grid);
        System.out.println(res);
    }

    public int equalPairs(int[][] grid) {
        int count = 0;
        for(int row = 0; row < grid.length-1; row++) {
            for(int col = 0; col < grid[0].length; col++) {
                if(grid[row][col] == grid[row+1][col]) {
                    count++;
                }
            }
        }
        return count;
    }
}
