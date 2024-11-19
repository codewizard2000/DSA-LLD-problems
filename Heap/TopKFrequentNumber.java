package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentNumber {
    public static void frequentNumber(int[] arr, int k){
        PriorityQueue<Map.Entry<Integer,Integer>> minheap = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            if(!map.containsKey(temp)){
                map.put(temp,1);
            }else{
                map.put(temp,map.get(temp)+1);
            }
        }
        for(Map.Entry<Integer,Integer> mpp : map.entrySet()){
            minheap.add(mpp);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        while(!minheap.isEmpty()){
            System.out.print(minheap.poll().getKey()+" ");
        }

    }
    public static void main(String[] args){
        int[] arr = {1,2,3,1,1,2,2,2,2,5,5,5,5,5};
        int k=2;
        frequentNumber(arr,k);

    }
}
