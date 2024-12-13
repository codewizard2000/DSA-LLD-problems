package ImpStringArrayQuestion;

public class CheckArraySorted {
//    public static boolean check(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++) {
//                if (arr[j] < arr[i]) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }// o(n2)

    public static boolean check(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr ={2,3,4,5,1};
        Boolean result = check(arr);
        System.out.print(result);
    }
}
