package basic_to_intermediate;

import java.util.Scanner;

public class Q13_SmallestOfNNumbers {

    public static void main(String[] args) {
        // Object creation
        Scanner in = new Scanner(System.in);

        // Variable Declaration or Memory Reservation
        int n, smallest;

        // Getting Input
        System.out.print("Enter how many numbers you want to input: ");
        n = in.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! N must be greater than 0.");
            in.close();
            return;
        }

        System.out.print("Enter number 1: ");
        smallest = in.nextInt();

        // Process the Result
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = in.nextInt();

            if (num < smallest) {
                smallest = num;
            }
        }

        // Print the Output
        System.out.println("The smallest number is: " + smallest);

        // Destroy the scanner object
        in.close();
    }
}
