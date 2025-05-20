package Practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        String[] string = new String[score.length];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        Arrays.sort(score);
        for(int i = score.length - 1; i >= 0; i--) {
            int ramk = score.length - i;
            if(ramk == 1) {
                string[map.get(score[i])] = "Gold Medal";
            } else if(ramk == 2) {
                string[map.get(score[i])] = "Silver Medal";
            } else if(ramk == 3) {
                string[map.get(score[i])] = "Bronze Medal";
            } else {
                string[map.get(score[i])] = String.valueOf(ramk);
            }
        }
        return string;
    }
}
