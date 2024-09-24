import java.util.Arrays;

public class partition {
    public static int[] solve(int[] arr, int x){
        int start=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]<x){
                int temp=arr[i];
                arr[i]=arr[start];
                arr[start]=temp;
                start++;
                i++;

            }else{
                i++;
            }

        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {7,3,2,5,1,6,4};
        int[] result = solve(arr,4);
        System.out.print(Arrays.toString(result));

    }
}
