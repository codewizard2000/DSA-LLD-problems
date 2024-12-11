package Linkedlist;
//revrse a linkedlist for size K
public class RevrseSizeK {
    public int data;
    public RevrseSizeK next;

    public RevrseSizeK(int data) {
        this.data = data;
        this.next = null;
    }

    public static RevrseSizeK reverseOfSizeK(RevrseSizeK head, int K) {
        RevrseSizeK curr = head;
        RevrseSizeK prev = null;
        RevrseSizeK currnext;
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

    public static void printll(RevrseSizeK head) {
        RevrseSizeK currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "->");
            currnode = currnode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        RevrseSizeK head = new RevrseSizeK(1);
        head.next = new RevrseSizeK(2);
        head.next.next = new RevrseSizeK(3);
        head.next.next.next = new RevrseSizeK(4);
        head.next.next.next.next = new RevrseSizeK(5);
        head.next.next.next.next.next = new RevrseSizeK(6);

        RevrseSizeK head2 = reverseOfSizeK(head, 2);
        printll(head2);
    }
}
