package ImpStringArrayQuestion;

import java.util.HashMap;
public class IsomorphicString {

    public static boolean isIsomorphic(String s, String t) {

        // Length check
        if (s.length() != t.length()) {
            return false;
        }

        // Mapping arrays (ASCII characters)
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // If both characters are not mapped yet
            if (mapS[ch1] == 0 && mapT[ch2] == 0) {
                mapS[ch1] = ch2;   // store ASCII of ch2
                mapT[ch2] = ch1;   // store ASCII of ch1
            }
            // If already mapped, check if mapping matches
            else {
                if (mapS[ch1] != ch2 || mapT[ch2] != ch1) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isIsomorphic("egg", "add"));    // true
        System.out.println(isIsomorphic("foo", "bar"));    // false
        System.out.println(isIsomorphic("paper", "title")); // true
        System.out.println(isIsomorphic("ab", "aa"));      // false
    }
}

