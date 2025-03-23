package codeWars;

public class reverseString {
    public static void main(String[] args) {
       char[] ch = new char[]{'h', 'e', 'l', 'l', 'o'};
        for (int i = 0; i < ch.length; i++) {
            reverse(ch);
        }
        System.out.println(ch);
        //reverse(ch);
    }
    static void reverse(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left <= right){
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }
}
