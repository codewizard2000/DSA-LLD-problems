package ImpStringArrayQuestion;

import java.util.HashMap;

import java.util.HashMap;
import java.util.Arrays;

public class SumBetweenRange {
    public static int[] sumbtwRange(int[] arr, int[][] B) {
        int[] result = new int[B.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            map.put(i, sum);
        }
        for (int i = 0; i < B.length; i++) {
            int start = B[i][0];
            int end = B[i][1];
            if (start == 0) {
                result[i] = map.get(end);
            } else {
                result[i] = map.get(end) - map.get(start - 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[][] B = {{1, 2}, {3, 5}};
        int[] result = sumbtwRange(arr, B);
        System.out.println(Arrays.toString(result));  // Output: [5, 12]
    }
}
