package codeWars;

public class armstrong {
    public static void main(String[] args) {
       boolean ans =  armStrong(371);
        System.out.println(ans);
    }

    public static boolean armStrong(int n){
        int count = 0;
        int res = 0;
        int temp = n;

        while(temp > 0){
            res = temp %10;
            temp = temp/10;
            count++;
        }

        temp = n;
        int sum = 0;

        while (temp > 0){
            int digit = temp % 10;
            int power = 1;

            for (int i = 0; i < count; i++) {
                power = power * digit;
            }
            sum = sum + power;
            temp = temp/10;
        }

         if(sum == n){
             return true;
         }else {
             return false;
         }
    }
}