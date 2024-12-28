package com.dailycodework.dream_shops.controller;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int countlogestsubstring(String str){
        int n = str.length();
        int maxLength = 0;
        int left = 0; // Left end of the window
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char currentChar = str.charAt(right);

            // If the character is already in the map, move the left end of the window
            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }

            // Update the character's index in the map
            map.put(currentChar, right);

            // Calculate the length of the current window and update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;

    }

    public static void main(String[] args){
        String str = "abcabcbb";
        int count = countlogestsubstring(str);
        System.out.print(" "+count);
    }
}
