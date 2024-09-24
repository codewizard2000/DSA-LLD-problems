package StackQueueImplementation;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    Map<Integer,Node> map = new HashMap<>();
    int capacity;
    Node head = new Node(0,0);
    Node tail = new Node(0,0);

    LRUCache(int capacity){
        this.capacity=capacity;
        head.next=tail;
        tail.prev = head;
    }

    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;

        }else{
            return -1;
        }
    }

    public void remove(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    public void insert(Node node){
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;

    }

    public void put(int key,int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(capacity==map.size()){
            remove(tail.prev);
        }

        insert(new Node(key,value));
    }
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // returns 1
        cache.put(3, 3); // evicts key 2
        System.out.println(cache.get(2)); // returns -1 (not found)
        cache.put(4, 4); // evicts key 1
        System.out.println(cache.get(1)); // returns -1 (not found)
        System.out.println(cache.get(3)); // returns 3
        System.out.println(cache.get(4)); // returns 4
    }
}
