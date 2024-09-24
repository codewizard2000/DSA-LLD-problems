package Linkedlist;

public class Node1 {
    int data;
    Node1 next;

    public Node1(int data ,Node1 next){
        this.data=data;
        this.next=next;
    }

    public static Node1 InsertAtPosition(Node1 head,int pos,int data){

        if(pos==0){
            Node1 newNode = new Node1(data,null);
            newNode.next=head;
            head=newNode;
        }else{
            Node1 currNode =head;
            for(int i=0;i<pos-1;i++){
                currNode=currNode.next;
            }
            Node1 newNode = new Node1(data,null);
            newNode.next=currNode.next;
            currNode.next=newNode;
        }
        return head;
    }
    public static void printLinkedList(Node1 head) {
        Node1 currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "->");
            currnode = currnode.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        Node1 head = new Node1(1, null);
        head = InsertAtPosition(head, 1, 2);
        head = InsertAtPosition(head, 2, 3);
        head = InsertAtPosition(head, 1, 4); // Insert 4 at position 1
        printLinkedList(head);
    }



}
