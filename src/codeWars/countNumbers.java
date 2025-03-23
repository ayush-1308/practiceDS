package codeWars;

public class countNumbers {
    public static void main(String[] args) {
        System.out.println(evenlyDivides(12));
    }

    static int evenlyDivides(int n) {
        // code here
        int temp = n;
        int count = 0;

        while(n > 0){
            int digit = n % 10;
            if (digit!= 0 && temp % digit == 0){
                count++;
            }
            n = n/10;
        }
        return count;
    }
}
