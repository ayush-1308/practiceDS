package codeWars;

import java.math.BigInteger;

public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("3876620623801494171", "6529364523802684779"));
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = num1.length() - 1; // Pointer for num1 (rightmost digit)
        int j = num2.length() - 1; // Pointer for num2 (rightmost digit)

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0; // Extract digit from num1
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0; // Extract digit from num2

            int sum = digit1 + digit2 + carry; // Sum of digits + carry
            carry = sum / 10; // Carry for next iteration
            result.append(sum % 10); // Append last digit to result

            i--; // Move to next digit in num1
            j--; // Move to next digit in num2
        }

        return result.reverse().toString(); // Reverse result to get correct order
    }
}
