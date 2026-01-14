package StackQueueImplementation;

public class StackUsingArray {
    int[] stack;
    int top;
    int size;

    public StackUsingArray(int size) {
        this.size = size;
        stack = new int[size];
        top = 0;   // stack is empty
    }

    public void push(int value) {
        if (top == size) {
            System.out.println("Stack overflow");
            return;
        }
        stack[top++] = value;
    }

    public int pop() {
        if (top == 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[--top];
    }

    public int peek() {
        if (top == 0) {
            System.out.println("Stack empty");
            return -1;
        }
        return stack[top - 1];
    }
}


