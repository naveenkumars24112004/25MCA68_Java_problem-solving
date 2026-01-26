package basic_to_intermediate;

import java.util.Scanner;

public class Q11_FactorialTable {

    public static void main(String[] args) {
        // Object creation
        Scanner in = new Scanner(System.in);

        // Variable Declaration or Memory Reservation
        int n;
        long fact = 1;

        // Getting Input
        System.out.print("Enter the N value: ");
        n = in.nextInt();

        // Print Header
        System.out.println("N   |   Factorial");
        System.out.println("--------------------");

        // Process and Print Table
        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.printf("%-3d | %12d%n", i, fact);
        }

        // Destroy the scanner object
        in.close();
    }
}
