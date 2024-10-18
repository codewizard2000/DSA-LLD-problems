package BinarySearch;

import java.util.ArrayList;

public class FirstANDlastOccurance {
//    public static ArrayList<Integer> getFirstLast(int[] arr, int x){
//        ArrayList<Integer> res = new ArrayList<>();
//        int last=-1,first=-1;// o(n) not optimised
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==x){
//                if(first==-1){
//                    first=i;
//                }
//                last=i;
//            }
//        }
//        res.add(first);
//        res.add(last);
//        return res;
//    }

    public static int lowerBound(int[] arr, int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int UpperBound(int[] arr, int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(arr[mid]>x){
                ans=mid;  // tc = 2*O(logn)
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static ArrayList<Integer> getFirstLast(int[] arr, int x){
        int n=arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        int lb = lowerBound(arr,x);
        if(lb==n || arr[lb]!=x){
            res.add(-1);
            res.add(-1);
            return res;
        }else{
            res.add(lb);
            res.add(UpperBound(arr,x)-1);
            return res;
        }

    }

    public static void main(String[] args){
        int[] arr = {1,2,3,3,4,7,8,8};
        int x=4;
        ArrayList<Integer> res = getFirstLast(arr,x);
        System.out.print(res);
    }
}
