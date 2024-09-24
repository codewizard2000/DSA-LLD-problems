package Linkedlist;

public class DeleteNode {
    public int data;
    public DeleteNode next;

    public DeleteNode(int data,DeleteNode next){
        this.data=data;
        this.next=null;
    }

    public static DeleteNode delete(DeleteNode head,int pos){
        DeleteNode curr=head;
        if(pos==0){
            curr=curr.next;
            return curr;

        }
        for(int i=0;i<pos-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;

        return head;

    }
    public static void printll(DeleteNode head){
        DeleteNode currnode = head;
        while(currnode!=null){
            System.out.print(currnode.data+"->");
            currnode=currnode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
        DeleteNode head= new DeleteNode(1,null);
        head.next=new DeleteNode(2,null);
        head.next.next=new DeleteNode(3,null);
        int postion=1;
        DeleteNode finalnode= delete(head,1);
        printll(finalnode);


    }
}
