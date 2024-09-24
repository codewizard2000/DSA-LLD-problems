import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static int[] insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }else {
                    break;
                }

            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {3,4,1,2};
        int[] result = insertion(arr);
        System.out.print(Arrays.toString(result));
    }
}
