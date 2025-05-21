package Practice.string;

public class GCDStrings {
    public static void main(String[] args) {
        String s = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        System.out.println(gcdOfStrings(s, "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if(!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }
        int length = gcd(str1.length(), str2.length());
        return str1.substring(0, length);
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
