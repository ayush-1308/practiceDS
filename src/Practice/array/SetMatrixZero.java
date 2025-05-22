package Practice.array;

public class SetMatrixZero {
    public static void main(String[] args) {

    }
    public void setZeroes(int[][] matrix) {
        boolean markerForFirstRow = false;
        for(int row = 0; row < matrix.length; row++) {
            if(matrix[row][0] == 0) {
                markerForFirstRow = true;
            }
            for(int col = 1; col < matrix[0].length; col++) {
                if(matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }
        for(int row = matrix.length - 1; row >= 0; row--) {
            for(int col = matrix[0].length - 1; col >= 1; col--) {
                if(matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
            if(markerForFirstRow == true) {
                matrix[row][0] = 0;
            }
        }
    }
}
