package Practice.string;

public class CheckIfPrefix {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};
        System.out.println(isPrefixString(s,words));
    }

    public static boolean isPrefixString(String s, String[] words) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < words.length){
            sb.append(words[i]);
            String s1 = sb.toString();
            if(s1.equals(s)){
                return true;
            }
            i++;
        }
        return false;
    }
}
