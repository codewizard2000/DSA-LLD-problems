package Linkedlist;
//palidrome ll
public class CheckPalindrome {
    public int data;
    public CheckPalindrome next;

    public CheckPalindrome(int data, CheckPalindrome next){
        this.data=data;
        this.next=null;
    }
    public static CheckPalindrome middlepoint(CheckPalindrome head){
        CheckPalindrome slow=head;
        CheckPalindrome fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public static boolean palindrome(CheckPalindrome head){
        if(head==null || head.next==null){
            return true;
        }

        CheckPalindrome mid = middlepoint(head);
        CheckPalindrome secondhalf = reverse(mid);
        CheckPalindrome firsthalf = head;
        while(secondhalf!=null){
            if(firsthalf.data!=secondhalf.data){
                return false;
            }
            firsthalf=firsthalf.next;
            secondhalf=secondhalf.next;
        }
        return true;

    }
    public static CheckPalindrome reverse(CheckPalindrome head){
        CheckPalindrome curr = head;
        CheckPalindrome currentNext;
        CheckPalindrome prev=null;

        while(curr!=null){
            currentNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currentNext;
        }

        return prev;

    }

    public static void main(String[] args) {
        CheckPalindrome head = new CheckPalindrome(1,null);
        head.next = new CheckPalindrome(2,null);
        head.next.next = new CheckPalindrome(3,null);
        head.next.next.next = new CheckPalindrome(2,null);
        head.next.next.next.next = new CheckPalindrome(1,null);

        if (palindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
