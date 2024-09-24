package StackQueueImplementation;

import java.util.Stack;

class MinStack {
    Stack<Pair> st=new Stack<>();;

//    public MinStack() {
//        st = new Stack<>();
//    }
//sc = 2N not good
    public void push(int x) {
        int min;
        if (st.isEmpty()) {
            min = x;
        } else {
            min = Math.min(st.peek().y, x);
        }
        st.push(new Pair(x, min));
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().x;
    }

    public int getMin() {
        return st.peek().y;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
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
