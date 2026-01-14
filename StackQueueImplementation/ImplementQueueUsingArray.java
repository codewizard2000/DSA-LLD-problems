package StackQueueImplementation;

public class QueueUsingArray {
    int[] queue;
    int front, rear, size;

    public QueueUsingArray(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = 0;
    }

    public void enqueue(int value) {
        if (rear == size) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = value;
    }

    public int dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front++];
    }

    public int peek() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

    public static void main(String[] args){
        ImplementQueueUsingArray queue = new ImplementQueueUsingArray(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        queue.front();

    }
}

