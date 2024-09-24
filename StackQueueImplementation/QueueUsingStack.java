package StackQueueImplementation;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue operation
    public void enqueue(int data) {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
    }

    // Dequeue operation
    public int dequeue() {
        if (s1.empty()) {
            throw new RuntimeException("Queue is empty");
        }
        return s1.pop();
    }

    // Peek operation
    public int peek() {
        if (s1.empty()) {
            throw new RuntimeException("Queue is empty");
        }
        return s1.peek();
    }

    // Print the queue
    public void print() {
        System.out.println(s1);
    }

    // Get the size of the queue
    public int size() {
        return s1.size();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Queue: ");
        queue.print(); // Output: [1, 2, 3]
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 1
        System.out.println("Queue: ");
        queue.print(); // Output: [2, 3]
        System.out.println("Peek: " + queue.peek()); // Output: 2
        System.out.println("Queue size: " + queue.size()); // Output: 2
        queue.enqueue(4);
        System.out.println("Queue: ");
        queue.print(); // Output: [2, 3, 4]
    }
}
