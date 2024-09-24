package Linkedlist;

public class IntersectionPointLL {
    public int data;
    public IntersectionPointLL next;

    public IntersectionPointLL(int data,IntersectionPointLL next){
        this.data=data;
        this.next=null;
    }
    public static int lengthll(IntersectionPointLL head){
        IntersectionPointLL curr = head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }

    public static IntersectionPointLL intersectionPoint(int d, IntersectionPointLL head1 ,IntersectionPointLL head2){
        IntersectionPointLL curr1 = head1;
        IntersectionPointLL curr2=head2;

        for(int i=0;i<d;i++){
            if(curr1==null){
                return null;
            }
            curr1=curr1.next;
        }
        while(curr1!=null && curr2!=null){
            if(curr1==curr2){
                return curr1;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return null;

    }

    public static void intersection(IntersectionPointLL head1,IntersectionPointLL head2){
        int len1=lengthll(head1);
        int len2=lengthll(head2);
        int diff=Math.abs(len2-len1);
        if(len1>len2){
            IntersectionPointLL finalnode=intersectionPoint(diff,head1,head2);
            System.out.println(finalnode.data);
        }else{
            IntersectionPointLL finalnode=intersectionPoint(diff,head2,head1);
            System.out.println(finalnode.data);
        }
    }

    public static void main(String[] args){
        IntersectionPointLL head1 = new IntersectionPointLL(1,null);
        head1.next = new IntersectionPointLL(2,null);
        head1.next.next = new IntersectionPointLL(3,null);
        head1.next.next.next = new IntersectionPointLL(4,null);
        head1.next.next.next.next = new IntersectionPointLL(5,null);

        // Creating second linked list
        IntersectionPointLL head2 = new IntersectionPointLL(10,null);
        head2.next = new IntersectionPointLL(20,null);
        head2.next.next = head1.next.next; // Intersection at node with value 3

        // Finding the intersection point
        intersection(head1, head2);

    }


}
