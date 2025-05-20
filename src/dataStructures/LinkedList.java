package dataStructures;

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}

public class LinkedList {
    private Node head;

    // 1. Add at end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // 2. Add at specific index
    public void add(int data, int index) {
        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int count = 0;
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 3. Remove by value
    public void remove(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // 4. Reverse the list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
    }

    // 5. Print list
    public void list() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

