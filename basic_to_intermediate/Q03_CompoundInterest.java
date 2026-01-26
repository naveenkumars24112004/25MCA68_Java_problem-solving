package basic_to_intermediate;

import java.util.Scanner;

public class Q03_CompoundInterest {

	public static void main(String[] args) {
		// object creation
		 	Scanner in = new Scanner(System.in);
		 
		// Variable Declaration or Memory Reservation
			double principal, rate, years, compoundAmount;
			double i; // Interest rate in fraction

		// Getting Input
			System.out.print("Enter Principal Value: ");
			principal = in.nextDouble();

			System.out.print("Enter Rate of Interest: ");
			rate = in.nextDouble();

			System.out.print("Enter No. of Years: ");
			years = in.nextDouble();

		// Process the Result
			i = rate / 100;
			compoundAmount = principal * Math.pow((1 + i), years);

		// Print the Output
			System.out.printf("Compound Interest = %.2f", compoundAmount);

		// Destroy the scanner object
			in.close();

	}

}
