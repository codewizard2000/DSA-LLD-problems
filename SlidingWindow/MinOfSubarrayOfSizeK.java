package SlidingWindow;

public class MinOfSubarrayOfSizeK {
    public static int minimum(int[] arr,int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int totalsum=sum;

        for(int i=k;i<arr.length;i++){
            totalsum=totalsum+arr[i]-arr[i-k];
            sum=Math.min(sum,totalsum);
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6};
        int k=3;
        int sum=minimum(arr,k);
        System.out.print(sum);
    }
}
