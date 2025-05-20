package dataStructures;

public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = capacity - 1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public void enqueue(int data){
        if (isFull()) {
            System.out.println("Queue overflow");
            return;
        }
        rear = (rear + 1)% capacity;
        arr[rear] = data;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return  -1;
        }
        int temp = arr[front];
        front = (front + 1) % capacity;
        size--;
        return temp;
    }

}
