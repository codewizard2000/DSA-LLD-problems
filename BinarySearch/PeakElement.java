package BinarySearch;

public class PeakElement {
//    public static int peak(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            if((i==0 || arr[i]>arr[i-1]) &&((i==arr.length-1) || arr[i]>arr[i+1])){
//                return i; //(tc(o(n))
//            }
//        }
//        return -1;
//    }


    public static int peak(int[] arr){
        if(arr.length==1){
            return 0;
        }
        if(arr[0]>arr[1]){
            return 0;
        }
        if(arr[arr.length-1]>arr[arr.length-2]){
            return arr.length-1;
        }
        int low=1, high=arr.length-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            } else if (arr[mid]>arr[mid-1]) {
                low=mid+1;

            }else{
                high=mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {2,2,2,4,3,3};
        int result =peak(arr);
        System.out.print(arr[result]);
    }
}
