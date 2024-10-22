package BinarySearch;

import java.util.Arrays;

public class AggressiveCow {
    public static Boolean canWePlace(int[] arr, int dist , int cows){
        int cowDistance=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                cowDistance++;
                last=arr[i];
            }
            if(cowDistance>=cows){
                return true;
            }

        }
        return false;
    }

    public static int aggresiveCow(int[] arr, int cows){
        Arrays.sort(arr);
        int low=1;
        int n=arr.length;
        int high=arr[n-1]-arr[0];
        while(low<=high){
            int mid=(low+high)/2;
            if((canWePlace(arr,mid,cows))==true){
                low=mid+1;

            }else{
                high=mid-1;
            }
        }
        return high;
    }
    public static void main(String[] args){
        int[] arr= {1,2,4,8,9};
        int cows=3;
        int result= aggresiveCow(arr,cows);
        System.out.print(result);
    }
    // maximize the minimum distance between cow first put for minimum distance of 1 btw cows than 2 than 3

}
