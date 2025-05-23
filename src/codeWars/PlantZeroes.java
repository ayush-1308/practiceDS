package codeWars;

public class PlantZeroes {
    public static void main(String[] args) {

    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int l = flowerbed.length;
        for (int i = 0; i < l; i++) {
            if(flowerbed[i] == 0) {
                int previous = (i == 0 ||  flowerbed[i-1] == 0) ? 0 : 1;
                int next = (flowerbed[l-1] == 0 ||  flowerbed[i-1] == 0) ? 0 : 1;

                if(previous == 0 && next == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        if(count >= n) {
            return true;
        }
        return false;
    }

}
