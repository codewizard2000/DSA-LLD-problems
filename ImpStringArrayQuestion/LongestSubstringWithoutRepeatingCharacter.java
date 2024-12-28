package com.dailycodework.dream_shops.controller;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int countlogestsubstring(String str){
        int count=0;
        char[] ch = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char character:ch){
            char element = character;
            if(!map.containsKey(element)){
                map.put(element,1);
            }else{
                map.put(element,map.get(element)+1);
            }
        }
        for(char word :ch){
            if(map.containsKey(word) && map.get(word)==1){
                count++;
                System.out.print(word+"");
            } else if (map.containsKey(word) && map.get(word)>1) {
                map.put(word,map.get(word)-1);
            }
        }
        return count;
    }

    public static void main(String[] args){
        String str = "AAABBBCCC";
        int count = countlogestsubstring(str);
        System.out.print(" "+count);
    }
}
