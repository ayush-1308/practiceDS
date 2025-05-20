package Practice.array;

import java.util.Arrays;
import java.util.HashSet;

public class MatrixReshape {

    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        set.size();
        int[][] arr = {{1,2},
                       {2,1}};
        int[][] newArr = matrixReshape(arr ,2,2);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(newArr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        System.out.println(row + " " + "djauhaffh" + col + " ");

        if((row * col) != (r * c)) {
            return mat;
        }

        int[][] outputArray = new int[r][c];
        int output_row = 0;
        int output_col = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                outputArray[output_row][output_col] = mat[i][j];
                output_col++;

                if(output_col == c) {
                    output_col =0 ;
                    output_row++;
                }
            }
        }

        return outputArray;
    }
}
