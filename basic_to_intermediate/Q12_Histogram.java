package basic_to_intermediate;

import java.util.Scanner;

public class Q12_Histogram {

    public static void main(String[] args) {
        // Object creation
        Scanner in = new Scanner(System.in);

        // Variable Declaration or Memory Reservation
        int[] numbers = new int[5];

        // Getting Input
        System.out.print("Enter 5 Numbers in the same line: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = in.nextInt();
        }

        // Process and Print Histogram
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Destroy the scanner object
        in.close();
    }
}
