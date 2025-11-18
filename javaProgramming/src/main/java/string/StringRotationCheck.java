package string;

public class StringRotationCheck {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";

        if (isRotation(str1, str2)) {
            System.out.println("String is a rotation");
        } else {
            System.out.println("String is NOT a rotation");
        }
    }

    public static boolean isRotation(String s1, String s2) {
        // Quick length check
        if (s1.length() != s2.length()) {
            return false;
        }

        // Combine s1 with itself and check if s2 is a substring
        String combined = s1 + s1;
        return combined.contains(s2);
    }
}

