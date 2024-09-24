import java.util.Arrays;

public class RowWiseSum {
    public static int[] sum(int[][]a){
        int[] arr = new int[a.length];
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[0].length;j++){
                sum=sum+a[i][j];
            }
            arr[i]=sum;
        }
        return arr;
    }

    public static void main(String[] args){
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[] result = sum(a);
        System.out.print(Arrays.toString(result));
    }
}
