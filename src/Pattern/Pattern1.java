package Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        //pattern4(5);
        //pattern5(5);
        //pattern6(5);
        //pattern7(5);
        //pattern8(5);
        pattern9(5);
    }

    /*

     * * * * *
     * * * *
     * * *
     * *
     *

     */

    static void pattern1(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */

    static void pattern3(int n){
        for (int row = 0; row < 2 * n ; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/*
            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *
*/
    // Diamond
    static void pattern4(int n){
        for (int row = 0; row < 2 * n ; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            //total no. of space
            int noOfSpaces = n - totalColsInRow;
            for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 1; row <= n ; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print("  ");
            }
            for (int i = row; i >= 1; i--) {
                System.out.print(i + " ");
            }
            for (int j = 2; j < row; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    /*

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *

     */
    static void pattern6(int n){
        for (int row = 0; row < 2*n ; row++) {

            int colForRows = row + 1;
            if (row > (2 * n - 1)/ 2 ){
            colForRows = 2*n - (row + 1) ;
            }
            for (int col = 0; col < colForRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

         *
        * *
       * * *
      * * * *
     * * * * *
     */

    static void pattern7(int n){
        for (int row = 0; row < n; row++) {

            int spacesForRows = n - row;
            for (int spaces = 0; spaces < spacesForRows; spaces++) {
                System.out.print(" ");
            }
            int colsForRows = row + 1;
            for (int col = 0; col < colsForRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

            *
          * *
        * * *
      * * * *
    * * * * *
      * * * *
        * * *
          * *
            *

     */

    static void pattern8(int n){
        for (int row = 1; row <= 2 * n; row++) {

            int spacesForRows = n - row;
            if (row > (2 * n)/2){
                spacesForRows = row - n ;
            }

            for (int spaces = 0; spaces < spacesForRows; spaces++) {
                System.out.print("  ");
            }

            int colsForRows = row;
            if (row > (2 * n)/2){
                colsForRows = 2*n - row;
            }

            for (int col = 0; col < colsForRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for (int row = 1; row <= 2*n ; row++) {

            int colForRows = row;
            if (row > (2*n)/2){
                colForRows = (2 * n) - row;
            }
            for (int col = 0; col < colForRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        
    }
}
