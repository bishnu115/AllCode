package Array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 40, 20, 50};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
/*
public class FindDuplicatesSimple {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 40, 20, 50};

        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // prevent printing same duplicate multiple times
                }
            }
        }
    }
}

 */
