package StackQueueImplementation;

public class ImplementStackUsingArray {
    public int top;
    public int[] stackArray;
    int size;

    public ImplementStackUsingArray(int size) {
        this.size = size;
        this.top = -1;
        this.stackArray = new int[size];
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is full");
            return;
        } else {
            top = top + 1;
            stackArray[top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int value = stackArray[top]; // Retrieve the top element
            top = top - 1;               // Decrement the top index
            System.out.println("Popped element: " + value); // Print the popped element
            return value;                // Return the retrieved element
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public static void main(String[] args) {
        ImplementStackUsingArray stack = new ImplementStackUsingArray(5); // Create a stack of size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Top element is: " + stack.peek());

        // Pop an element and check the top element
        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());

        // Push a new element and check the top element
        stack.push(70);
        System.out.println("Top element is: " + stack.peek());
    }
}
