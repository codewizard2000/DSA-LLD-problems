package SlidingWindow;

public class MaxOfSubArrayOfKsize {
    public static int maximum(int[] arr, int k){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int sum1=sum;
        for(int i=k;i<n;i++){
            sum1=sum1+arr[i]-arr[i-k];
            sum=Math.max(sum,sum1);

        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        int result = maximum(arr, k);
        System.out.println("The maximum sum of a subarray of size " + k + " is: " + result);
    }
}
