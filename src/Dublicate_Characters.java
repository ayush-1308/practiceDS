public class Dublicate_Characters {
    public static void main(String[] args) {
        String str = "PRANAY";
        dublicate(str);
    }

    public static void dublicate(String s){
        int[] charCount = new int[256];    // Supports all ASCII characters

        for(char ch : s.toCharArray()){
            charCount[ch]++;
        }

        System.out.println("\"Duplicate characters in the string: ");
        for (int i = 0; i < 256; i++) {
            if(charCount[i] > 1){
                System.out.println((char) i + " → " + charCount[i] + " times");
            }
            if(charCount[i] == 1){
                System.out.println((char) i + " → " + charCount[i] + " times");
            }
        }
    }
}
