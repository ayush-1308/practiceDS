package Practice;

public class removeDublicates {
    public static void main(String[] args) {
        //skip("", "baccadh");
        String ans = skipApple("baccappledqeqh");
        System.out.println(ans);
    }

    // using void return type:
    // skipping the character a;
    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a'){
            skip(p, up.substring(1));
        }else {
            skip(p+ch,up.substring(1));
        }
    }

    // using string return type:
    // skipping the character a;
    public static String skip1(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            return skip1(up.substring(1));
        }else {
            return ch + skip1(up.substring(1));
        }
    }

    //skipping a string
    public static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
}
