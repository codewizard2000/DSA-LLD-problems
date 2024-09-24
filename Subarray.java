public class Subarray{
    public static int sum(int[] arr,int B, int C){
        int sum=0;
        for(int i=0;i<B;i++){
            sum=sum+arr[i];
            if(sum==C){
                return 1;
            }
        }

        int totalsum=sum;
        for(int i=B;i<arr.length;i++){
            totalsum=totalsum+arr[i]-arr[i-B];
            if(totalsum==C){
                return 1;
            }
        }
        return 0;

    }
    public static void main(String[] args){
        int[] arr = {1, 12, 10, 3, 14, 10, 5};
        int B = 4;
        int C=6;
        int result  = sum(arr,B,C);
        System.out.print(result);

    }
}
