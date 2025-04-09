package reverse.day6;

public class ReverseString {

    public static void main(String[] args) {
        String str = "ayush";
        reverse(str);
        reverseUsingCharArray(str);
    }

    public static void reverse(String string){
        int start =  0;
        int end =  string.length() - 1;

        StringBuilder stringBuilder = new StringBuilder(string);

        while (start <= end){
            char temp = stringBuilder.charAt(start);
            stringBuilder.setCharAt(start, stringBuilder.charAt(end));
            stringBuilder.setCharAt(end, temp);

            start++;
            end--;
        }
        System.out.println("Reversed String : " + stringBuilder);
        System.out.println("Original String : " + string);
    }

    //other method is to convert string to char Array
    public static void reverseUsingCharArray(String string){
        char[] arr = string.toCharArray();
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String ans = new String(arr);
       // System.out.println(ans);
        System.out.println("Reversed String: " + ans);
    }
}
