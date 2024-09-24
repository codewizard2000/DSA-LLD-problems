package StackQueueImplementation;

import java.util.ArrayList;


public class SlidingWindowMaximum {
    public static ArrayList max(int[] arr,int k){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<=arr.length-k;i++){
            int max=arr[i];
            for(int j=i;j<=i+k-1;j++){
                max=Math.max(max,arr[j]);

            }
            l.add(max);// brute froce approach
        }
        return l;
    }
    public static void main(String[] args){
        int[] arr = {4,0,-1,3,5,3,6,8};
        int k=3;
        ArrayList<Integer> L =max(arr,k);
        System.out.print(L);

    }
}
