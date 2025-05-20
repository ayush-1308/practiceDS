package Practice.string;

public class palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        checkIfPalindrome(str);
    }

    public static void checkIfPalindrome(String str){
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            if(arr[left] != arr[right]){
                System.out.println("Not a palindrome!");
                break;
            } else{
                left++;
                right--;
            }
            System.out.println("String is a palindrome!");
        }
    }

}
