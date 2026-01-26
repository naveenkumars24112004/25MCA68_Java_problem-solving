package basic_to_intermediate;

import java.util.Scanner;

public class Q09_SumOfEvenIntegers {

	public static void main(String[] args) {
		// Object creation
		 Scanner in = new Scanner(System.in);
		 
		// Getting Input
	        System.out.println("Calculate the sum of even numbers from 2 to 30");

		// Variable Declaration or Memory Reservation
	        int sum = 0;

	    // Process the Result
	        for (int i = 2; i <= 30; i += 2) {
	            sum += i;
	        }

	    // Print the Output
	        System.out.printf("Sum of even numbers from 2 to 30 = %d", sum);
	        
	    //destroy the object
	        in.close();
	}

}
