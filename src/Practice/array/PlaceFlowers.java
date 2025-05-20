package Practice.array;

public class PlaceFlowers {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,0,0};
        PlaceFlowers p = new PlaceFlowers();
        System.out.println(p.canPlaceFlowers(arr, 2));
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;

        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                int prev = (i == 0 || flowerbed[i - 1] == 0) ? 0 : 1;
                int next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ? 0 : 1;

                if(prev == 0 && next == 0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
//        if(n==0) return true;
//        int n1 = flowerbed.length - 1;
//        for(int i = 1; i < n1; i++ ) {
//            if(flowerbed[0] == 0 && flowerbed[1] == 0) {
//                flowerbed[0] = 1;
//                n--;
//                if(n == 0) return true;
//            } if(flowerbed[n1] == 0 && flowerbed[n1-1] == 0) {
//                flowerbed[0] = 1;
//                n--;
//                if(n == 0) return true;
//            }
//            if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
//                flowerbed[i] = 1;
//                n--;
//                if(n == 0) {
//                    return true;
//                }
//            }
//        }
//        return false;
    }
}
