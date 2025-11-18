package Array;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23};

        int max = arr[0];  // Assume the first element is the largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if a larger element is found
            }
        }

        System.out.println("Largest element is: " + max);
    }
}

