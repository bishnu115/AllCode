package string;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "Java is a popular programming language";

        // Trim leading/trailing spaces and split by one or more spaces
        String[] words = sentence.split("\\s+");

        System.out.println("Total number of words: " + words.length);
    }
}
