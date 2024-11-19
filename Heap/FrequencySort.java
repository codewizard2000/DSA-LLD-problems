package Heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
    public static void frequency(int[] arr){
        PriorityQueue<Map.Entry<Integer,Integer>> maxheap = new PriorityQueue<>((a,b)->b.getValue()- a.getValue());
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
            maxheap.add(mpp);
        }
        while (!maxheap.isEmpty()) {
            Map.Entry<Integer, Integer> entry = maxheap.poll();
            int frequency = entry.getValue();
            int element = entry.getKey();
            for (int i = 0; i < frequency; i++) {
                System.out.print(element + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 2, 5, 5, 5, 5, 5};
        frequency(arr);
    }

}
