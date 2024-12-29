package com.dailycodework.dream_shops.controller;

public class MaximumSubarraySum {
    public static int maximumSum(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum=0;
        // also added printing max subaaray logic
        int start=0;
        int ansStart=-1;
        int ansEnd=-1;
        for(int i=0;i<arr.length;i++){
            if(sum==0){
                 start=i;
            }
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0){
                sum=0;// when ever sum is <0 dont include it in sum move the sum forward
            }
        }
        System.out.println("Printing subarray");
        for(int i=ansStart ;i<=ansEnd;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.print("maximum sum is: ");
        return max;

    }

    public static void main(String[] args){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maximumSum(arr);
        System.out.print(result);
    }
}
