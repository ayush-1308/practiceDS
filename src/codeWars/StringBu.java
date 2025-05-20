package codeWars;

public class StringBu {
    public static void main(String[] args) {
        String s = "jqktcurgdvlibczdsvnsg";
        System.out.println(lengthAfterTransformations(s, 7517));
    }

    public static int lengthAfterTransformations(String s, int t) {
        while(t != 0){
            StringBuilder string = new StringBuilder();
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == 'z'){
                    string.append("ab");
                } else {
                    int ch = s.charAt(j) + 1;
                    string.append((char) ch);
                }
            }
            t--;
            s = string.toString();
        }
        System.out.println(s.length());
        return s.length();
    }
}
