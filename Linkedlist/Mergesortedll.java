package Linkedlist;

public class Mergesortedll {
    public int data;
    public Mergesortedll next;

    public Mergesortedll(int data, Mergesortedll next){
        this.data=data;
        this.next=next;
    }

    public static Mergesortedll merge(Mergesortedll head1,Mergesortedll head2){
        Mergesortedll curr1=head1;
        Mergesortedll curr2=head2;
        Mergesortedll dummy = new Mergesortedll(0,null);
        Mergesortedll tail=dummy;
        while(curr1!=null && curr2!=null){
            if(curr1.data<=curr2.data){
                tail.next=curr1;
                curr1=curr1.next;

            }else{
                tail.next=curr2;
                curr2=curr2.next;
            }
            tail=tail.next;
        }
        if(curr1!=null){
            tail.next=curr1;
            curr1=curr1.next;
        }
        if(curr2!=null){
            tail.next=curr2;
            curr2=curr2.next;
        }

        return dummy.next;


    }
    public static void main(String[] args) {
        // Create two sorted linked lists
        Mergesortedll head1 = new Mergesortedll(1, new Mergesortedll(3, new Mergesortedll(5, new Mergesortedll(7, null))));
        Mergesortedll head2 = new Mergesortedll(2, new Mergesortedll(4, new Mergesortedll(6, new Mergesortedll(8, null))));

        // Merge the two sorted linked lists
        Mergesortedll mergedHead = merge(head1, head2);

        // Print the merged linked list
        Mergesortedll current = mergedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

}
