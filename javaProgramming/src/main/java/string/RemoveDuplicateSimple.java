package string;

public class RemoveDuplicateSimple {

        public static void main(String[] args) {
            String input = "programming";
            String result = "";

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (result.indexOf(ch) == -1) {
                    result = result + ch;
                }
            }

            System.out.println("Original: " + input);
            System.out.println("Without duplicates: " + result);
        }
    }


