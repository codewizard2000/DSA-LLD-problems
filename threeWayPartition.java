import java.util.Arrays;

public class threeWayPartition {
    public static int[] three(int[] arr,int minvalue,int maxvalue){
        int start=0;
        int end=arr.length-1;
        int i=0;
        while(i<=end){
            if(arr[i]<minvalue){
                int temp=arr[i];
                arr[i]=arr[start];
                arr[start]=temp;
                i++;
                start++;
            }else if(arr[i]>maxvalue){
                int temp2=arr[i];
                arr[i]=arr[end];
                arr[end]=temp2;
                end--;
            }else{
                i++;

            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,  14, 5,  20, 4, 2, 54,
                20, 87, 98, 3,  1, 32};
        int[] result = three(arr,14,20);
        System.out.print(Arrays.toString(arr));
    }
}
