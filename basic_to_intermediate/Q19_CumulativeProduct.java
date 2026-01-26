package basic_to_intermediate;

import java.util.Scanner;

public class Q19_CumulativeProduct {

    public static void main(String[] args) {
        // Object creation
        Scanner in = new Scanner(System.in);

        // Variable Declaration
        int n;
        double num, product = 1.0;

        // Getting Input
        System.out.print("Enter how many numbers you want to multiply: ");
        n = in.nextInt();

        // Process: input each number and multiply
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            num = in.nextDouble();
            product *= num;
        }

        // Print the Output
        System.out.printf("Cumulative Total = %.6f%n", product);

        // Destroy the scanner object
        in.close();
    }
}
