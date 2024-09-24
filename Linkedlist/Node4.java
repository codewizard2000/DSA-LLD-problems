package Linkedlist;
// reverse a ll
public class Node4 {
    public int data;
    public Node4 next;

    public Node4(int data,Node4 next){
        this.data=data;
        this.next=null;
    }

    public static  Node4 reverse(Node4 head){
        Node4 curr = head;
        Node4 currentNext;
        Node4 prev=null;

        while(curr!=null){
            currentNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currentNext;
        }

        return prev;

    }
    public static void printll(Node4 head){
        Node4 currnode = head;
        while(currnode!=null){
            System.out.print(currnode.data+"->");
            currnode=currnode.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        Node4 head = new Node4(1,null);
        head.next=new Node4(2,null);
        head.next.next=new Node4(3,null);
        Node4 finalhead=reverse(head);
        printll(finalhead);
    }
}
