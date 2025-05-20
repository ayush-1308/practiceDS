package Practice.string;

import java.util.HashMap;
import java.util.Map;

public class AllOccurence {
    public static void main(String[] args) {
        String s = "veixwaeoezcf";
        AllOccurence oc = new AllOccurence();
        System.out.println(oc.areOccurrencesEqual(s));
    }
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        
        Integer firstValue = null;
        for(Integer value : map.values()){
            if(firstValue == null){
                firstValue = value;
            } else if(!firstValue.equals(value)){
                return false;
            }
        }
        return true;
    }
}
