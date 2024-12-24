package ImpStringArrayQuestion;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static char nonrepeating(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char element = str.charAt(i);
            if (!map.containsKey(element)) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0'; // Return null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = nonrepeating(input);
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("There is no non-repeating character in the input string.");
        }
    }
}

