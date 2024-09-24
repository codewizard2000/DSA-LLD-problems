package StackQueueImplementation;

public class ImplementQueueUsingArray {
    public int[] queueArray;
    public int size;
    public int top;
    public int front;

    public ImplementQueueUsingArray(int size){
        this.size=size;
        this.front=0;
        this.top=-1;
        this.queueArray=new int[size];

    }

    public void enqueue(int value){
        if(top==size-1){
            System.out.println("queue is full");
            return;
        }else{
            top=top+1;
            queueArray[top]=value;
        }
    }

    public void dequeue(){
        if(top==-1){
            System.out.println("queue is empty");
            return ;
        }else{
            for(int i=0;i<top;i++){
                queueArray[i]=queueArray[i+1];
            }
            top=top-1;
        }
    }

    public void display(){
        if(top==-1){
            System.out.println("queue is empty");
        }else{

            for(int i=0;i<=top;i++){
                System.out.print(queueArray[i]+" ");
            }
        }

    }

    public int front(){
        if(top==-1){
            System.out.print("queue is empty no front element ");
            return -1;
        }else{
            System.out.println("top element is "+queueArray[front]);
            return queueArray[front];
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
