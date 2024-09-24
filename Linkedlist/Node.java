package Linkedlist;

public class Node {
    int data;
    Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public static Node createList(int N) {
        if (N <= 0) {
            return null;
        }
        Node head = new Node(1, null);
        Node tail = head;
        for (int i = 2; i <= N; i++) {
            Node newNode = new Node(i, null);
            tail.next = newNode;
            tail = tail.next;
        }
        return head;
    }

    public static void printLinkedList(Node head) {
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "->");
            currnode = currnode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        int N = 5; // Example value
        Node head = createList(N);
        printLinkedList(head);
    }
}

