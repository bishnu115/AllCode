package Array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {25, 42, 18, 97, 42, 60};

        // Assume minimum possible values
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element is: " + second);
        }
    }
}

