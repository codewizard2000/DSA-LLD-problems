package com.dailycodework.dream_shops.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagram {
    public static void groupAnagram(String[] str) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String s : str) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s); // Add the string to the list in both cases
        }

        // Print the groups of anagrams
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {
        String[] arr1 = {"act", "god", "cat", "dog", "tac"};
        groupAnagram(arr1);
    }
}
