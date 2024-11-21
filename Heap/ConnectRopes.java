package Heap;

import java.util.PriorityQueue;

// you to add the rope to get the minimum cost so add the minimum number
public class ConnectRopes {
    public static int getMinimumCostForJoiningRopes(int[] arr){
        int sum=0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            minHeap.add(arr[i]);
        }
        while(minHeap.size()>=2){
            int first=minHeap.poll();
            int second=minHeap.poll();
            int cost=first+second;
            sum=sum+cost;
            minHeap.add(cost);
        }

        return sum;

    }
    public static void main(String[] args){
        int[] ropes = {1,2,3,4,5};
        int cost = getMinimumCostForJoiningRopes(ropes);
        System.out.println("Minimum cost to connect ropes: " + cost);
    }

    // tc=nlogn


}
