package StackQueueImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q = new LinkedList<>();

    public void push(int data){
        int s = q.size();
        q.add(data);
        for(int i=0;i<s;i++){
            q.add(q.remove());
        }
    }

    public int pop(){
        if(q.isEmpty()){
            return -1;
        }else{
            return q.remove();
        }
    }

    public int top(){
        if(q.isEmpty()){
            return -1;
        }else{
            return q.peek();
        }
    }

    public void printQueue() {
        System.out.println(q);
    }

    public static void main(String[] args){
        StackUsingQueue s = new StackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("poped  "+s.pop());
        s.printQueue();
    }
}
