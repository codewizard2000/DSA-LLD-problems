package com.dailycodework.dream_shops.model;

import java.util.HashMap;

public class LargestSubarrayWith0sum {
    public static int largestSubarray(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                ans = Math.max(ans, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 3};
        System.out.println("Length of the largest subarray with 0 sum: " + largestSubarray(arr));
    }
}

