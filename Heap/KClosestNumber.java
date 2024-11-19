package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KClosestNumber {

    public static void findKClosestNumber(int[] arr, int target, int k){
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            int diff = Math.abs(arr[i]-target);
            maxHeap.add(new Pair(diff,arr[i]));
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        while(!maxHeap.isEmpty()){
            System.out.print(maxHeap.poll().second+" ");
        }
    }

    public static void main(String[] args){
        int[] arr ={5,6,7,8,9};
        int k=3;
        int target = 7;
        findKClosestNumber(arr,target,k);
    }

   // PriorityQueue<Pair> maxHeap = new PriorityQueue<>(k, (a, b) -> Integer.compare(b.first, a.first));

}
//tc=o(nlogk)
//space=o(k)

// largest , greatest, top =min heap
// smallest , lowest ,closest= max heap
