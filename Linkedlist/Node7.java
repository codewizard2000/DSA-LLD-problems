package Linkedlist;

public class Node7 {
    public int data;
    public Node7 next;
    public Node7 prev;

    // Constructor
    public Node7(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public static Node7 delete(Node7 head, int pos) {
        if (head == null) {
            return null;
        }
        Node7 curr = head;
        if (pos == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }
        for (int i = 0; i < pos; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }
        if (curr.prev != null) {
            curr.prev.next = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // Creating a hardcoded doubly linked list: 1 <-> 2 <-> 3 <-> 4 <-> 5
        Node7 head = new Node7(1);
        Node7 second = new Node7(2);
        Node7 third = new Node7(3);
        Node7 fourth = new Node7(4);
        Node7 fifth = new Node7(5);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;

        // Deleting node at position 2 (0-based index)
        head = delete(head, 2);

        // Printing the updated list
        Node7 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
