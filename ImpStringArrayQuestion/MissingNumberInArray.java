package ImpStringArrayQuestion;

public class MissingNumberInArray {
//    public static int missing(int[] arr, int N){
//        for (int i = 1; i <= N; i++) {
//            int flag = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] == i) {
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 0) return i;
//        }
//        return -1;
//    }

    public static int missing(int[] arr,int N){
        int sum=(N*(N+1))/2;
        int total=0;
        for(int i=0;i<arr.length;i++){
            total=total+arr[i];
        }
        int result =sum-total;
        return result;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        int N=5;
        int result = missing(arr,N);
        System.out.print(result);
    }
}
