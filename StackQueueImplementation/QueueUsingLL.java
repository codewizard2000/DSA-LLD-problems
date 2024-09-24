package StackQueueImplementation;

public class QueueUsingLL {
    public int data;
    public QueueUsingLL next;
    public QueueUsingLL front;
    public QueueUsingLL back;

    public QueueUsingLL(int data){
        this.data = data;
        this.next = null;
    }

    public QueueUsingLL(){
        this.front = this.back = null;
    }

    // Method to add an element to the queue
    public void enqueue(int value){
        QueueUsingLL newNode = new QueueUsingLL(value);
        if (front == null && back == null) {
            front = back = newNode;
            return;
        } else {
            back.next = newNode;
            back = newNode;
        }
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        QueueUsingLL temp = front;
        front = front.next;

        if (front == null) {
            back = null;
        }

        return temp.data;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Method to get the front element of the queue
    public int peek() {
        if (front != null) {
            return front.data;
        }
        return -1; // Return -1 if the queue is empty
    }

    // Method to display all elements in the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        QueueUsingLL temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue elements:");
        queue.display();

        System.out.println("Front element is: " + queue.peek());

        queue.dequeue();
        System.out.println("Queue elements after dequeue:");
        queue.display();

        System.out.println("Front element after dequeue is: " + queue.peek());

        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
