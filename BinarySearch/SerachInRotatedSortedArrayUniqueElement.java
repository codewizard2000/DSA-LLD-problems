package BinarySearch;

public class SerachInRotatedSortedArrayUniqueElement {
    public static int search(int[] arr, int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[low]<=arr[mid]){// check if either left or right half is sorted one will alsways be sorted
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
        return -1;
    }

    public static void main(String[] args){
        int[] arr ={7,6,5,1,2,3};
        int x=5;
        int result = search(arr,x);
        System.out.print(result);

    }
}
