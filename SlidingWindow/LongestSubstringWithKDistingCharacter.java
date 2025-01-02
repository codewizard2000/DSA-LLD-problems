package SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithKDistingCharacter {
    public static int longestSize(String str,int k){
        int n=str.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int maxlength=0;
        int left=0;
        for(int right=0;right<n;right++){
            char element = str.charAt(right);
            map.put(element,map.getOrDefault(element,0)+1);
            while(map.size()>k){
                char leftelement = str.charAt(left);
                map.put(leftelement,map.get(leftelement)-1);
                if(map.get(leftelement)==0){
                    map.remove(leftelement);
                }
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);

        }
        return maxlength;
    }
    public static void main(String[] args){
        String str = "aabbcc";
        int k=2;
        int result = longestSize(str,k);
        System.out.print(result);
    }
}
