package reverse.day6;

import java.util.HashMap;

public class Occurence {
    public static void main(String[] args) {
        String string = "abcabc";
        occurence(string);
    }

    public static void occurence(String str){
        char[] arr = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
    }
}
