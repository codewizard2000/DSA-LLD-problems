package BinarySearch;
// binary search implementation
public class findElement {
    public static int binarySearch(int[] arr, int x){
        int low =0;
        int high = arr.length-1;
        while(low<=high){
            int  mid = low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]<x){
                low=mid+1;
            }
            if(arr[mid]>x){
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int result = binarySearch(arr,5);
        System.out.print(result);
    }
}
