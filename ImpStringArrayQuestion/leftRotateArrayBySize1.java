package ImpStringArrayQuestion;

public class leftRotateArrayBySize1 {
    public static int[] rotate(int[] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;

        return arr;
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int[] result = rotate(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }
    }
}
