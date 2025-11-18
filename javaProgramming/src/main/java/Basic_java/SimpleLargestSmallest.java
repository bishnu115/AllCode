package Basic_java;

import java.util.Scanner;

public class SimpleLargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int largest = a;
        int smallest = a;

        if (b > largest) largest = b;
        if (c > largest) largest = c;

        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        scanner.close();
    }
}

