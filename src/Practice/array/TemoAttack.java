package Practice.array;

public class TemoAttack {
    public static void main(String[] args) {
        int[] t = {1,2};
        System.out.println(findPoisonedDuration(t, 2));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        for(int i = 0; i < timeSeries.length - 1; i++){
            total += Math.min(timeSeries[i+1] - timeSeries[i], duration);
        }
        if(timeSeries.length > 0){
            total += duration;
        }
        return total;
    }
}
