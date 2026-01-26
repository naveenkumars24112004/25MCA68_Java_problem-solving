package basic_to_intermediate;

import java.util.Scanner;

public class Q10_ProductOfOddIntegers {

	public static void main(String[] args) {
		// Object creation
		 Scanner in = new Scanner(System.in);

		// Variable Declaration or Memory Reservation
	        int limit;
	        long product = 1;

	    // Getting Input
	        System.out.print("Enter the upper limit (odd number, e.g., 15): ");
	        limit = in.nextInt();

	    // Process the Result
	        for (int i = 1; i <= limit; i += 2) {
	            product *= i;
	        }

	    // Print the Output
	        System.out.printf("Product of odd numbers from 1 to %d = %d", limit, product);

	    // Destroy the scanner object
	        in.close(); 
		 
	}

}
