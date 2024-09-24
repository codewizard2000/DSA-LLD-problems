package Linkedlist;
//palidrome ll
public class Node5 {
    public int data;
    public Node5 next;

    public Node5(int data, Node5 next){
        this.data=data;
        this.next=null;
    }
    public static Node5 middlepoint(Node5 head){
        Node5 slow=head;
        Node5 fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public static boolean palindrome(Node5 head){
        if(head==null || head.next==null){
            return true;
        }

        Node5 mid = middlepoint(head);
        Node5 secondhalf = reverse(mid);
        Node5 firsthalf = head;
        while(secondhalf!=null){
            if(firsthalf.data!=secondhalf.data){
                return false;
            }
            firsthalf=firsthalf.next;
            secondhalf=secondhalf.next;
        }
        return true;

    }
    public static  Node5 reverse(Node5 head){
        Node5 curr = head;
        Node5 currentNext;
        Node5 prev=null;

        while(curr!=null){
            currentNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currentNext;
        }

        return prev;

    }

    public static void main(String[] args) {
        Node5 head = new Node5(1,null);
        head.next = new Node5(2,null);
        head.next.next = new Node5(3,null);
        head.next.next.next = new Node5(2,null);
        head.next.next.next.next = new Node5(1,null);

        if (palindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
