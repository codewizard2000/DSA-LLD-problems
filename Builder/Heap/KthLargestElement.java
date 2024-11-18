package Heap;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int getKthLargestElement(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();

    }
    public static void main(String[] args){
        int[] arr = {4,5,6,1,2,3,4,0,10,7};
        int k =4;
        int result = getKthLargestElement(arr,k);
        System.out.print(result);
    }
    // TC=nlogk
    //sc = o(k)
    // this question can also be solved by just sorting and traverse in k but TC will be ologn not ologk
}
