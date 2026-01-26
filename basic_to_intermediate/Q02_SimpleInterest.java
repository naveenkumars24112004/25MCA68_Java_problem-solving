package basic_to_intermediate;

import java.util.Scanner;

public class Q02_SimpleInterest {

	public static void main(String[] args) {
		// Object creation
				Scanner in = new Scanner(System.in);
				
		// Variable Declaration or Memory Reservation
				double principal, rate, years, si;
				
		// Getting Input
				System.out.println("Enter Principal Amount: ");
				principal = in.nextDouble();
				
				System.out.println("Enter Rate of Interest: ");
				rate = in.nextDouble();
				
				System.out.println("Enter No. of Years: ");
				years = in.nextDouble();
				
		// Process the Result
				si = (principal * rate * years) / 100;
				
		// Print the Output
				System.out.printf("Simple Interest = %.2f", si);
				
		// Destroy the scanner object
				in.close();

	}

}
