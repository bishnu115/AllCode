package Array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 4, 9, 1, 3, 5};

        // Use HashSet to remove duplicates
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.println("After removing duplicates: " + set);
    }
}
