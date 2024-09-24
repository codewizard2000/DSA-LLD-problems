package Linkedlist;
//revrse a linkedlist for size K
public class Node6 {
    public int data;
    public Node6 next;

    public Node6(int data) {
        this.data = data;
        this.next = null;
    }

    public static Node6 reverseOfSizeK(Node6 head, int K) {
        Node6 curr = head;
        Node6 prev = null;
        Node6 currnext;
        int count = 0;

        // Reverse first K nodes of the linked list
        while (curr != null && count < K) {
            currnext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currnext;
            count++;
        }

        // Now head points to the Kth node. So change next of head to (K+1)th node
        if (curr != null) {
            head.next = reverseOfSizeK(curr, K);
        }

        return prev;
    }

    public static void printll(Node6 head) {
        Node6 currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "->");
            currnode = currnode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Node6 head = new Node6(1);
        head.next = new Node6(2);
        head.next.next = new Node6(3);
        head.next.next.next = new Node6(4);
        head.next.next.next.next = new Node6(5);
        head.next.next.next.next.next = new Node6(6);

        Node6 head2 = reverseOfSizeK(head, 2);
        printll(head2);
    }
}
