package string;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWords {
    public static void main(String[] args) {
        String input = "Java is easy to learn and Java is powerful";

        // Convert to lowercase and split into words
        String[] words = input.toLowerCase().split("\\s+");

        // Map to store word counts
        Map<String, Integer> wordCount = new HashMap<>();

        // Count each word
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Display duplicate words
        System.out.println("Duplicate words:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
            }
        }
    }
}
