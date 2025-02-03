package ImpStringArrayQuestion;

import java.util.HashMap;

public class LongestSubarraySumK {
    public static int subarrayLenthOfSizeK(int[] arr, int N, int k){
        int n=arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int maxlength = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if (sum == k) {
                maxlength = Math.max(maxlength, i + 1);
            }
            if(map.containsKey(sum-k)){
                maxlength=Math.max(maxlength,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxlength;

    }

    public static void main(String[] args){
        int[] arr = {1, -1, 3, 2, -2, -3, 3};
        int N = 3;
        int k=0;
        int result = subarrayLenthOfSizeK(arr,N, k);
        System.out.print(result);

    }
}
