package ImpStringArrayQuestion;

import java.util.Arrays;

public class LargestElementInArray {
//    public static int largest(int[] arr){
//        Arrays.sort(arr);
//        return arr[arr.length-1];
//    }
//    // tc=n(logn)
//
    public static int largest(int[] arr){
        int n=arr.length;
        int largest =arr[0];
        for(int i=1;i<n;i++ ){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    //tc=o(n)

    public static void main(String[] args){
        int[] arr = {1,2,6,3,5,8};
        int res = largest(arr);
        System.out.print(res);
    }
}
