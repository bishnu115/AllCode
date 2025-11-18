package Array;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 4, 89, 33};

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
