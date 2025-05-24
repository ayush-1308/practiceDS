package Practice.string;

public class ReverseWordInAString {
    public static void main(String[] args) {
        String s = "  Bob    Loves  Alice   ";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        s= s.trim();
        int i = s.length() - 1;
        int j = s.length();

        StringBuilder string = new StringBuilder();
            while (i >= 0) {
                if(s.charAt(i) == ' ') {
                    // for extra spaces checking
                    if (i + 1 != j) {
                        string.append(s, i + 1, j);
                        string.append(' ');
                    }
                    j = i;
                }
                i--;
            }
            if( j != 0) {
                string.append(s, 0, j);
            }
            return new String(string).trim();
    }
}
