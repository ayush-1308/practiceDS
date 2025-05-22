package Practice.array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNoOFCandies {
    public static void main(String[] args) {
        int[] candies = {4,1,1,5,2};
        System.out.println(kidsWithCandies(candies, 3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        List<Boolean> list = new ArrayList<>();
        int i = 0;
        while (i < candies.length) {
            if ((candies[i] + extraCandies) >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
            i++;
        }
        return list;
    }
}
