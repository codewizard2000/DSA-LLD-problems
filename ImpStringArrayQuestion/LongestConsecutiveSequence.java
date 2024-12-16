package ImpStringArrayQuestion;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int it :set){
            if(!set.contains(it-1)){
                int x=it;
                int count=1;
                while(set.contains(x+1)){
                    x=x+1;
                    count=count+1;
                }
                longest=Math.max(longest,count);

            }

        }
        return longest;
    }
    public static void main(String[] args){
        int[] arr = {100, 200, 1, 2, 3, 4};
        int ans = longestConsecutive(arr);
        System.out.println("The longest consecutive sequence is " + ans);
    }
//o(n) tc


}
