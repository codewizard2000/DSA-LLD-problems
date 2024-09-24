package Linkedlist;

public class DeleteMiddleNodeLL {
    public int data;
    public DeleteMiddleNodeLL next;

    public DeleteMiddleNodeLL(int data , DeleteMiddleNodeLL next){
        this.data = data;
        this.next = next;
    }

    public static DeleteMiddleNodeLL middlePoint(DeleteMiddleNodeLL head){
        DeleteMiddleNodeLL slow = head;
        DeleteMiddleNodeLL fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static DeleteMiddleNodeLL delete(DeleteMiddleNodeLL head){
        if (head == null || head.next == null) {
            return null; // If the list is empty or has only one node, return null
        }

        DeleteMiddleNodeLL mid = middlePoint(head);
        if (head == mid) {
            return head.next;
        }
        DeleteMiddleNodeLL curr = head;
        while(curr.next!=mid){
            curr=curr.next;

        }
        curr.next=mid.next;
        return head;
    }
    public static void printLinkedList(DeleteMiddleNodeLL head) {
        DeleteMiddleNodeLL currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "->");
            currnode = currnode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
       DeleteMiddleNodeLL head = new DeleteMiddleNodeLL(1,null);
        head.next = new DeleteMiddleNodeLL(2,null);
        head.next.next = new DeleteMiddleNodeLL(3,null);
        head.next.next.next = new DeleteMiddleNodeLL(2,null);

        DeleteMiddleNodeLL resultNode = delete(head);
        printLinkedList(resultNode);

    }



}
