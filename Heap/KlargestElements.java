package Heap;

import java.util.PriorityQueue;

public class KlargestElements {
    public static void getKlargestElement(int[] arr, int k){
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            minheap.add(arr[i]);
            if(minheap.size()>k){
                minheap.poll();
            }
        }while(!minheap.isEmpty()){
            System.out.print(minheap.poll()+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int k=3;
        getKlargestElement(arr,k);
    }
    //sc:o(k)
    //tc:o(nlogk)

}
