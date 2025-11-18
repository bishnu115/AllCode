package Array;

import java.util.Arrays;

public class IA_rev_change1stlast
{

    public static void main(String[] args) {
        int[] aa = {4, 5, 6, 7};

        // Step 1: Reverse and store into a new array
        int[] reversed = new int[aa.length];
        for (int i = 0; i < aa.length; i++) {
            reversed[i] = aa[aa.length - 1 - i];
        }
        System.out.println("After reversing: " + Arrays.toString(reversed));

        // Step 2: Swap first and last of the reversed array
        int temp = reversed[0];
        reversed[0] = reversed[reversed.length - 1];
        reversed[reversed.length - 1] = temp;

        System.out.println("After swapping first & last: " + Arrays.toString(reversed));
    }
}