package string;

public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "Java is easy";

        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            result.append(reversed.reverse()).append(" ");
        }

        System.out.println("Reversed each word: " + result.toString().trim());
    }
}

