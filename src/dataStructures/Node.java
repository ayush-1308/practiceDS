package dataStructures;

public class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNextNode(){
        return this.next;
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }
}
