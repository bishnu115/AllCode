package Array;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};  // 3 is missing
        int n = 6;  // Total count including the missing number

        int expectedSum = n * (n + 1) / 2;  // Sum of 1 to n
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;
        System.out.println("Missing number is: " + missing);
    }
}

