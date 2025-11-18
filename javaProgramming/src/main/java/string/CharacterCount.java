package string;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    //public class EasyCharCount {
    public static void main(String[] args) {
        String input = "programming";
        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        System.out.println(charCount);
    }
}





