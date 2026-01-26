package basic_to_intermediate;

import java.util.Scanner;

public class Q20_FibonacciSeries {

    public static void main(String[] args) {
        // Object creation
        Scanner in = new Scanner(System.in);

        // Variable Declaration
        int n;
        int f1 = 1, f2 = 1, f;

        // Getting Input
        System.out.print("How many Fibonacci terms? ");
        n = in.nextInt();

        // Process and Print the Output
        if (n >= 1) {
            System.out.print(f1 + " ");
        }
        if (n >= 2) {
            System.out.print(f2 + " ");
        }

        for (int i = 3; i <= n; i++) {
            f = f1 + f2;
            System.out.print(f + " ");
            f1 = f2;
            f2 = f;
        }

        // Print newline at the end
        System.out.println();

        // Destroy the scanner object
        in.close();
    }
}
