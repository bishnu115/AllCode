package string;

public class CountCharacterVOWELCONSTANT {
    public static void main(String[] args) {
        String str = "bish";
        int vowel=0;
        int co=0;
        for (int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel++;
            }
            else {
                co++;
            }
        }
        System.out.println(vowel);
        System.out.println(co);

    }
}

