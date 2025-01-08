package SlidingWindow;

import java.util.HashMap;

public class CountSubstringWithDisctinctCharacter {
    public static int countSubstringDistinctCharacter(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        int n=str.length();
        int count=0;
        int left=0;
        for(int k=0;k<n;k++){
            char element = str.charAt(k);
            map.put(element,map.getOrDefault(element,0)+1);
            while(map.get(element)>1){
                char leftelement = str.charAt(left);
                map.put(leftelement,map.get(leftelement)-1);
                if(map.get(leftelement)==0){
                    map.remove(leftelement);
                }
                left++;
            }
            count = count+k-left+1;

        }
        return count;
    }
    public static void main(String[] args){
        String str ="gfg";
        System.out.print(countSubstringDistinctCharacter(str));

    }
}
