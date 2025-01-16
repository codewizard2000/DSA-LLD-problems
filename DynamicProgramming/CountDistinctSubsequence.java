package DynamicProgramming;

import java.util.HashMap;

public class CountDistinctSubsequence {
    public static int countDistinctSubsequences(String str) {
        int n = str.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: empty subsequence

        // Map to store the last occurrence of each character
        HashMap<Character, Integer> lastOccurrence = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            char ch = str.charAt(i - 1);
            dp[i] = 2 * dp[i - 1];

            if (lastOccurrence.containsKey(ch)) {
                int lastIndex = lastOccurrence.get(ch);
                dp[i] -= dp[lastIndex - 1];
            }

            lastOccurrence.put(ch, i);
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String str = "gfg";
        System.out.println("Number of distinct subsequences: " + countDistinctSubsequences(str));
    }

}
