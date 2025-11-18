package Basic_java;

public class SwapTwoNumbers {
    public static void withtemp() {
        int a = 10;
        int b = 20;
        int temp;
        System.out.println("before no are a=" + a + "b= " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("value a=" + a + "b= " + b);
    }

    public static void withouttemp() {
        int a = 10;
        int b = 20;
        int c;
        System.out.println("before no are a=" + a + "b= " + b);
        a = a + b;//30
        b = a - b;
        a = a - b;

        System.out.println("value a=" + a + "b= " + b);

    }

    public static void main(String[] args) {
        // withtemp();
        withouttemp();
    }
}
