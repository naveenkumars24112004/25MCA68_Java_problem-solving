package basic_to_intermediate;

import java.util.Scanner;

public class Q04_Fahreheit2Celusis {

	public static void main(String[] args) {
		//Object creation
		  Scanner in = new Scanner(System.in);
		  
		// Variable Declaration or Memory Reservation
			double f, c;

		// Getting Input
			System.out.print("Enter Temperature in Fahrenheit: ");
			f = in.nextDouble();

		// Process the Result
			c = (5 / 9.0) * (f - 32);

		// Print the Output
			System.out.printf("%f deg F is %f deg C ", f, c);

		// Destroy the scanner object
			in.close();

	}

}
