package ImpStringArrayQuestion;

import java.util.HashSet;
import java.util.Set;

public class DistinctPalindromicSubstrings {
    public static Set<String> findPalindromicSubstrings(String str) {
        Set<String> palindromes = new HashSet<>();
        int n = str.length();

        // Check for palindromes of odd length
        for (int center = 0; center < n; center++) {
            int left = center, right = center;
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                palindromes.add(str.substring(left, right + 1));
                left--;
                right++;
            }
        }

        // Check for palindromes of even length
        for (int center = 0; center < n - 1; center++) {
            int left = center, right = center + 1;
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                palindromes.add(str.substring(left, right + 1));
                left--;
                right++;
            }
        }

        return palindromes;
    }

    public static void main(String[] args) {
        String str = "abaaa";
        Set<String> result = findPalindromicSubstrings(str);
        System.out.println("Below are " + result.size() + " palindrome sub-strings:");
        for (String palindrome : result) {
            System.out.println(palindrome);
        }
    }
}
