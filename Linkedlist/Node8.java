package Linkedlist;

public class Node8 {
    public int data;
    public Node8 next;
    public Node8 prev;

    // Constructor
    public Node8(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public static Node8 insert(Node8 head, int data, int pos) {
        Node8 newNode = new Node8(data);
        if (head == null) {
            return newNode;
        }
        if (pos == 0) {
            newNode.next = head;
            head.prev = newNode;
            newNode.prev=null;
            return newNode;
        }
        Node8 curr = head;
        for (int i = 0; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        newNode.next = curr.next;
        newNode.prev = curr;
        if (curr.next != null) {
            newNode.next.prev = newNode;
        }
        curr.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        // Creating a hardcoded doubly linked list: 1 <-> 2 <-> 3 <-> 4 <-> 5
        Node8 head = new Node8(1);
        Node8 second = new Node8(2);
        Node8 third = new Node8(3);
        Node8 fourth = new Node8(4);
        Node8 fifth = new Node8(5);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;

        // Inserting node with data 6 at position 2 (0-based index)
        head = insert(head, 6, 2);

        // Printing the updated list
        Node8 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
