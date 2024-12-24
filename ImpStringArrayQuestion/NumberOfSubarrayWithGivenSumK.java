package ImpStringArrayQuestion;

import java.util.HashMap;

public class NumberOfSubarrayWithGivenSumK {
    public static int noOfSubarray(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        map.put(0,1);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            int remove = sum-k;
            if(map.containsKey(remove)){
                count=count+map.get(remove);

            }else{
                map.put(sum,map.getOrDefault(remove,0)+1);
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int count = noOfSubarray(arr, k);
        System.out.println("The number of subarrays with sum " + k + " is: " + count);
    }

}
