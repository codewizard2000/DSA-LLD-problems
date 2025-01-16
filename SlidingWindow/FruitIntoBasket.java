package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

//alternative sol max length of subrray with atmost 2 types of number
public class FruitIntoBasket {
    public static int MaximumFruitInBasket(int[] arr) {
        int max = 0;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > 2) {
                int leftelement = arr[left];
                map.put(leftelement, map.get(leftelement) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
    public static void main(String[] args){
        int arr[]= {3,3,3,1,2,1,1,2,3,4};
        System.out.print(MaximumFruitInBasket(arr));
    }


}
