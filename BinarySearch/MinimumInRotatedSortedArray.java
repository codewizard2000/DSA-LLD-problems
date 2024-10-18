package BinarySearch;

public class MinimumInRotatedSortedArray {
//    public static int minimum(int[] arr){
//        int min=Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){ //brute force TC=o(n)
//            if(arr[i]<=min){
//                min=arr[i];
//            }
//
//        }
//        return min;
//    }

    public static int minimum(int[] arr){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            ans=Math.min(arr[mid],ans);
            if(arr[low]<=arr[mid]){
                ans=Math.min(ans,arr[low]);
                low=mid+1;

            }else{
                high=mid-1;
                ans=Math.min(ans,arr[mid]);

            }
        }
        return ans;

    }

    public static void main(String[] args){
        int[] arr = {3,4,5,6,2,2};
        int result = minimum(arr);
        System.out.print(result);
    }
}
