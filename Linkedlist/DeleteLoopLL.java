package Linkedlist;

public class DeleteLoopLL {
    public int data;
    public DeleteLoopLL next;

    public DeleteLoopLL(int data, DeleteLoopLL next){
        this.data = data;
        this.next = next;
    }

    public static boolean Delete(DeleteLoopLL head){
        DeleteLoopLL slow = head;
        DeleteLoopLL fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                removeloop(slow, head);
                return true;
            }
        }
        return false;
    }

    public static void removeloop(DeleteLoopLL loophead, DeleteLoopLL head){
        int k = 1;
        DeleteLoopLL ptr1 = loophead;
        DeleteLoopLL ptr2 = loophead;
        while(ptr1.next != ptr2){
            ptr1 = ptr1.next;
            k++;
        }

        DeleteLoopLL ptr3 = head;
        DeleteLoopLL ptr4 = head;
        for(int i = 0; i < k; i++){
            ptr4 = ptr4.next;
        }

        while(ptr3 != ptr4){
            ptr4 = ptr4.next;
            ptr3 = ptr3.next;
        }
        while(ptr4.next != ptr3){
            ptr4 = ptr4.next;
        }
        ptr4.next = null;
    }

     public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 10 -> 20 -> 30 -> 40 -> 50 -> 60
        DeleteLoopLL head = new DeleteLoopLL(10, null);
        head.next = new DeleteLoopLL(20, null);
        head.next.next = new DeleteLoopLL(30, null);
        head.next.next.next = new DeleteLoopLL(40, null);
        head.next.next.next.next = new DeleteLoopLL(50, null);
        head.next.next.next.next.next = new DeleteLoopLL(60, null);

        // Creating a loop resulting in the linked list:
        // 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 30 ...
        head.next.next.next.next.next.next = head.next.next;

        // Check if the loop is detected
        if(Delete(head)) {
            System.out.println("Loop detected and removed");
        } else {
            System.out.println("No loop detected");
        }
    }
}
