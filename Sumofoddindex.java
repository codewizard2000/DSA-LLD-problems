import java.lang.reflect.Array;
import java.util.Arrays;

public class Sumofoddindex {
    public static int[] sum(int[] arr,int[][] B){
        int[] psum = new int[arr.length];
        psum[0]=0;
        for(int i=1;i< arr.length;i++){
            if(i%2!=0){
                    psum[i]=arr[i]+psum[i-1];
            }else{
                psum[i]=psum[i-1];
            }
        }
        int Q=B.length;
        int[] arr2 = new int[Q];
        for(int i=0;i<Q;i++){
            int start=B[i][0];
            int end=B[i][1];

            if(start==0){
                arr2[i]=psum[end];

            }else{
                arr2[i]=psum[end]-psum[start-1];
            }
        }
        return arr2;
    }

    public static void main(String[] args){
        int[][] B = {{1,2},{3,5}};
        int[] arr = {1,2,3,4,5,6};
        int [] result = sum(arr,B);
        System.out.print(Arrays.toString(result));
    }
}
