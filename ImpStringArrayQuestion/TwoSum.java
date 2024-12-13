package ImpStringArrayQuestion;

public class TwoSum {
    public static boolean existpair(int[] arr, int target){
        int n=arr.length;
        int left=0;
        int right =n-1;

        int sum=0;
        while(left<right){
            sum=arr[left]+arr[right];
            if(sum==target){
                return true;
            }
            if(sum<target){
                left++;
            }else{
                right--;
            }

        }
        return false;
    }
//    public static boolean existpair(int[] arr, int sum){
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j< arr.length;j++) {
//                if (arr[i] + arr[j] == sum) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }// tc=o(n2)



    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int sum=4;
        Boolean result = existpair(arr,sum);
        System.out.print(result);
    }
}
