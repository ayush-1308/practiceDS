package Practice.array.basic;

public class EquiElem {
    public static void main(String[] args) {
        int[] arr = {-10, 6, 5, 7, 3, 5, -10, 3};
        System.out.println(equiElem(arr));
    }

    public static int equiElem(int[] arr){
        for (int i = 0; i < arr.length; i++) {
        //int rightSum = 0;
            int leftSum = 0;
            for (int j = 0; j <= i; j++) {
                leftSum += arr[j];
            }
            int rightSum = 0;
            for (int k = i + 2; k < arr.length; k++) {
                rightSum += arr[k];
            }
            if(rightSum == leftSum){
                System.out.println("The equilibrium element is: " + arr[i + 1]);
                return i + 1;
            }
//            System.out.println( "Left Sum : " + leftSum);
//            System.out.println("Right Sum : " + rightSum);
        }

        return 0;
    }
}
