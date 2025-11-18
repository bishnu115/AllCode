import java.util.HashSet;
import java.util.Set;

public class rahulshetty {
    static int[] ss = {1, 2, 3, 7, 8, 4};

    public static void checkLength() {
        int dsf = ss.length;
        System.out.println("Length is" + dsf);
    }

    public static void printAllaElement() {
        for (int i = 0; i <= ss.length - 1; i++) {
            System.out.print("all element is" + ss[i]);
        }
    }

    public static void reverse() {
        for (int i = ss.length - 1; i >= 0; i--) {
            System.out.print("reverse is :" + ss[i]);
        }
    }

    public static void sum() {
        int sum = 0;
        for (int i = 0; i <= ss.length - 1; i++) {
            sum = sum + ss[i];
        }
        System.out.println("sum is :" + sum);
    }

    public static void maximum() {
        int max = ss[0];
        for (int i = 0; i <= ss.length - 1; i++) {
            if (max < ss[i])
                max = ss[i];
        }
        System.out.println("max no is: " + max);
    }

    public static void minimum() {
        int min = ss[0];
        for (int i = 0; i <= ss.length - 1; i++) {
            if (min > ss[i])
                min = ss[i];
        }
        System.out.println("min no is: " + min);
    }

    public static boolean arraySorted() {

        for (int i = 0; i < ss.length - 1; i++) {
            if (ss[i] > ss[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void second_Largest() {
        int max = ss[0];
        int secomdmax = ss[0];

        for (int i = 0; i < ss.length - 1; i++) {
            if (max < ss[i]) {
                max = ss[i];
            }
        }
        for (int i = 0; i < ss.length - 1; i++) {
            if (ss[i] != max && ss[i] > secomdmax) {
                secomdmax = ss[i];
            }
        }
        System.out.println("2nd max is"+secomdmax);

    }
    public static void RemoveDuplicate(){
        Set<Integer> set = new HashSet<>();
        for (int num : ss) {
            set.add(num);
        }

        System.out.println("After removing duplicates: " + set);
    }



    public static void main(String[] args) {
        checkLength();
        printAllaElement();
        System.out.println("");
        reverse();
        System.out.println("");
        sum();
        maximum();
        minimum();
        // Program to search an element in a sorted array (Binary Search).
        //  Program to count the frequency of each element in an array.
        System.out.println("Is array sorted? " + arraySorted());
        second_Largest();
        RemoveDuplicate();

    }
}

