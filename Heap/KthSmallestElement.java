package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

// heap has time complexity of nlogK which is better than sorting nlogn
public class KthSmallestElement {
    public static int getKthSmallestElement(int[] arr, int k){
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){
            maxheap.add(arr[i]);

            if(maxheap.size()>k){
                maxheap.poll();
            }

        }
        return maxheap.peek();
    }
     public static void main(String[] args){
        int arr[]={4,5,1,2,3,0};
        int k=3;
        int result = getKthSmallestElement(arr,k);
        System.out.print(result);
     }
     // sc = o(k)       2 1 0
}
