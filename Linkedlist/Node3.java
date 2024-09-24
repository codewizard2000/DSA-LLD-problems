package Linkedlist;

public class Node3 {
    int data;
    Node3 next;

    public Node3(int data, Node3 next) {
        this.data = data;
        this.next = next;
    }

    public static int findElement(Node3 head, int B) {
        Node3 currnode = head;
        while (currnode != null) {
            if (currnode.data == B) {
                return 1;
            }
            currnode = currnode.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        // Hardcoded linked list: 1 -> 2 -> 3 -> 4 -> null
        Node3 head = new Node3(1, null);
        head.next = new Node3(2, null);
        head.next.next = new Node3(3, null);
        head.next.next.next = new Node3(4, null);

        int B = 5; // Element to find
        int result = findElement(head, B);

        if (result == 1) {
            System.out.println("Element " + B + " is found in the linked list.");
        } else {
            System.out.println("Element " + B + " is not found in the linked list.");
        }
    }
}
