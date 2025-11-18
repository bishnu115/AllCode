package string;

public class palindrom {

    public static void palindromw() {
        String str = "12321";
//        String rev = new StringBuilder(str).reverse().toString();
//        System.out.println(str.equals(rev));
        StringBuilder rev=new StringBuilder(str);
        String sad= rev.reverse().toString();
       System.out.println(str.equals(sad));

    }

    public static void palimdromusingforloop() {
        String abc = "12321";
        String rev = "";
        for (int i = abc.length() - 1; i >= 0; i--) {
            rev = rev + abc.charAt(i);
        }
        System.out.println(abc.equals(rev));
    }

    public static boolean apnacollege() {
        String str = "a11ssa";
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;

            }
        }
    return true;
    }


    public static void main(String[] args) {
        //  palimdromusingforloop();
          palindromw();
//        apnacollege();
      //  System.out.println(apnacollege());

    }
}
