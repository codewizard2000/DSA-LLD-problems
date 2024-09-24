import java.util.Arrays;

public class MaximumUnsortedArray {
    public static int[] subUnsort(int[] A) {
        int[] x = new int[A.length];
        for(int i=0;i<A.length;i++){
            x[i]=A[i];
        }
        Arrays.sort(x);
        int start=A.length-1;
        int end=0;

        for(int i=0;i<A.length;i++){
            if(A[i]!=x[i]){
                start=Math.min(start,i);
                end=Math.max(end,i);


            }
        }
        if(end==0){
            return new int[]{-1};
        }else{
            return new int[]{start,end};
        }



    }
    public static void main(String[] args){
        int[] arr = {1,3,2,4};
        int[] result = subUnsort(arr);
        System.out.print(Arrays.toString(result));

    }

}
