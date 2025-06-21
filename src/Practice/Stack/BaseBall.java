package Practice.Stack;

import java.util.Stack;

public class BaseBall {
    public static void main(String[] args) {

    }
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i = 0; i < operations.length; i++) {
            if(operations[i].equals("+")) {
                int temp = stack.get(stack.size() - 2);
                stack.push(temp+stack.peek());
            } else if(operations[i].equals("D")) {
                stack.push(stack.peek()*2);
            } else if(operations[i].equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        for(int i: stack) {
            sum+=i;
        }
        return sum;
    }
}
