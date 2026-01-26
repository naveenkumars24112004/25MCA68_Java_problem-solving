package basic_to_intermediate;

import java.util.Scanner;

public class Q08_SumOfOddIntegers {

	public static void main(String[] args) {
		//Object creation
		 Scanner in = new Scanner(System.in);

		// Variable Declaration or Memory Reservation
	        int n, sum = 0;

	    // Getting Input
	        System.out.print("Enter how many odd numbers to sum: ");
	        n = in.nextInt();

	    // Process the Result
	        for (int i = 1; i <= (2 * n - 1); i += 2) {
	            sum += i;
	        }

	    // Print the Output
	        System.out.printf("Sum of first %d odd numbers is %d%n", n, sum);

	    // Destroy the scanner object
	        in.close();
	}

}
