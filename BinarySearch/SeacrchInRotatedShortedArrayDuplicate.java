package BinarySearch;

public class SeacrchInRotatedShortedArrayDuplicate {
    public static Boolean search(int[] arr, int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return true;
            }
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){// this line cheeck for {3,1,2,3,3,3,3} where low=mid=high than just slide low ++, high--;
                low++;
                high--;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=x && x<=arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(arr[mid]<=x && x<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,5,6,7};
        int x=8;
        Boolean result = search(arr,x);
        System.out.print(result);
    }
}
