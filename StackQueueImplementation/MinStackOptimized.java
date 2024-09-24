package StackQueueImplementation;

import java.util.Stack;



import java.util.Stack;

public class MinStackOptimized {
    Stack<Integer> st = new Stack<>();
    int mini;

    MinStackOptimized() {
        mini = Integer.MAX_VALUE;
    }

    public void push(int value) {
        if (st.empty()) {
            mini = value;
            st.push(value);
        } else {
            if (value > mini) {
                st.push(value);
            } else {
                st.push(2 * value - mini);
                mini = value;
            }
        }
    }

    public void pop() {
        if (st.empty()) {
            return;
        } else {
            int value = st.pop();
            if (value < mini) {
                mini = 2 * mini - value;
            }
        }
    }

    public int top() {
        if (st.empty()) {
            return -1; // or throw an exception
        } else {
            int value = st.peek();
            if (value < mini) {
                return mini;
            } else {
                return value;
            }
        }
    }

    public int getMin() {
        if (st.empty()) {
            return -1; // or throw an exception
        } else {
            return mini;
        }
    }

    public static void main(String[] args) {
        MinStackOptimized minStack = new MinStackOptimized();
        minStack.push(3);
        minStack.push(5);
        System.out.println("Current Min: " + minStack.getMin()); // Output: 3
        minStack.push(2);
        minStack.push(1);
        System.out.println("Current Min: " + minStack.getMin()); // Output: 1
        minStack.pop();
        System.out.println("Current Min: " + minStack.getMin()); // Output: 2
        minStack.pop();
        System.out.println("Top Element: " + minStack.top());    // Output: 5
        System.out.println("Current Min: " + minStack.getMin()); // Output: 3
    }
}
