package Heap;

import java.util.PriorityQueue;
// quetsion can be also written as nearly sorted k array 
// ek particular range me hi sort karna hai {6,5,3,2,8,10} ramge will be 6 t0 2 element  and we will put 2 in index one now we have 5,6,3 increase range to 4(input) 5,6,7,3,8 now check again
public class SortKSortedArray {
    public static void sortKsortedarray(int[] arr, int k){
        int index=0;
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i=0;i<=k;i++){
            minheap.add(arr[i]);// add K+1 element in heap first
        }
        for(int i=k+1;i<arr.length;i++){
            arr[index]=minheap.poll(); // added 2 and 3 in array at 0,1 index by poll method
            minheap.add(arr[i]);
            index++;
        }
        while(!minheap.isEmpty()){
            arr[index]=minheap.poll();// add rest of element in the array remaining in heap
            index++;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    //   3 5 6 8 10

    public static void main(String[] args){
        int[] arr = {6,5,3,2,8,10,9};
        int k=4;
        sortKsortedarray(arr,k);
    }
    // tc:o(nlogk) sc:o(k)

}
