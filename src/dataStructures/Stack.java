package dataStructures;

public class Stack {
    private int top;
    private int[] arr;

    public Stack(int size){
        this.top = -1;
        this.arr = new int[size];
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full!");
            return;
        }
        top++;
        arr[top] = data;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return arr[top];
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return - 1;
        }
        return arr[top--];
    }

    public boolean isFull(){
        return top == arr.length - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

}
