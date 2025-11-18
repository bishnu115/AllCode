package string;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String input = "Java   is  easy  to learn";

        // Remove all types of whitespace characters (spaces, tabs, newlines)
        String noSpaces = input.replaceAll("\\s+", "");

        System.out.println("Original: " + input);
        System.out.println("Without spaces: " + noSpaces);
    }
}

