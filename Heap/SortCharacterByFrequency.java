package Heap;

import java.util.*;

public class SortCharacterByFrequency {
    public static void sortCharacterByFrequency(String str) {
        // PriorityQueue with custom comparator to handle frequency and lexicographical order
        PriorityQueue<Map.Entry<Character, Integer>> minHeap = new PriorityQueue<>(
                (a, b) -> {
                    if (a.getValue().equals(b.getValue())) {
                        return a.getKey().compareTo(b.getKey()); // Lexicographical order if frequencies are the same
                    } else {
                        return a.getValue() - b.getValue(); // Frequency order
                    }
                }
        );

        // HashMap to count frequencies of characters
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char element = str.charAt(i);
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        // Add all entries from the map to the minHeap
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            minHeap.add(entry);
        }

        // Build the result string based on the sorted order
        StringBuilder result = new StringBuilder();
        while (!minHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = minHeap.poll();
            int frequency = entry.getValue();
            char character = entry.getKey();
            for (int i = 0; i < frequency; i++) {
                result.append(character);
            }
        }

        // Print the result
        System.out.print(result.toString());
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        sortCharacterByFrequency(str);
    }
}
