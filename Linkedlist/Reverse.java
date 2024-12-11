package Linkedlist;
// reverse a ll
public class Reverse {
    public int data;
    public Reverse next;

    public Reverse(int data, Reverse next){
        this.data=data;
        this.next=null;
    }

    public static Reverse reverse(Reverse head){
        Reverse curr = head;
        Reverse currentNext;
        Reverse prev=null;

        while(curr!=null){
            currentNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currentNext;
        }

        return prev;

    }
    public static void printll(Reverse head){
        Reverse currnode = head;
        while(currnode!=null){
            System.out.print(currnode.data+"->");
            currnode=currnode.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        Reverse head = new Reverse(1,null);
        head.next=new Reverse(2,null);
        head.next.next=new Reverse(3,null);
        Reverse finalhead=reverse(head);
        printll(finalhead);
    }
}
