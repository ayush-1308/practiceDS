package codeWars;

public class MultiplyString {
    public static void main(String[] args) {

        MultiplyString multiplyString = new MultiplyString();
        String ans = multiplyString.multiply("2", "3");
        //System.out.println(multiply("2", "3"));
    }

    public String multiply(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int result = n1 * n2;

        return String.valueOf(result);
    }
}
