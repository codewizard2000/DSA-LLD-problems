package Linkedlist;

public class DetectLoop {
    public int data;
    public DetectLoop next;

    public DetectLoop(int data, DetectLoop next){
        this.data = data;
        this.next = next;
    }

    public static boolean loop(DetectLoop head){
        DetectLoop slow = head;
        DetectLoop fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 10 -> 20 -> 30 -> 40 -> 50 -> 60
        DetectLoop head = new DetectLoop(10, null);
        head.next = new DetectLoop(20, null);
        head.next.next = new DetectLoop(30, null);
        head.next.next.next = new DetectLoop(40, null);
        head.next.next.next.next = new DetectLoop(50, null);
        head.next.next.next.next.next = new DetectLoop(60, null);

        // Creating a loop resulting in the linked list:
        // 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 30 ...
        head.next.next.next.next.next.next = head.next.next;

        // Check if the loop is detected
        if(loop(head)) {
            System.out.println("Loop detected");
        } else {
            System.out.println("No loop detected");
        }
    }
}
