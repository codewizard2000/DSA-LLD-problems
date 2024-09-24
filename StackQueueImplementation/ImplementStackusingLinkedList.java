package StackQueueImplementation;

public class ImplementStackusingLinkedList {
    public int data;
    public ImplementStackusingLinkedList next;
    public ImplementStackusingLinkedList top; // Changed to private

    public ImplementStackusingLinkedList(int data){
        this.data = data;
        this.next = null;
        this.top = null;
    }

    public ImplementStackusingLinkedList() {
        this.top = null; // Default constructor to initialize top
    }

    public void push(int data){
        ImplementStackusingLinkedList newNode = new ImplementStackusingLinkedList(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int data = top.data;
            top = top.next;
            return data;
        }
    }

    public int peek(){
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return top.data;
        }
    }

    public void display(){
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        ImplementStackusingLinkedList currentNode = top;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        ImplementStackusingLinkedList stack = new ImplementStackusingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Output: 30 -> 20 -> 10 -> null

        System.out.println("Top element is " + stack.peek()); // Output: Top element is 30

        stack.pop();
        stack.pop();
        stack.pop();
        stack.display(); // Output: 20 -> 10 -> null

        System.out.println("Stack is empty: " + stack.isEmpty()); // Output: Stack is empty: false
    }
}

