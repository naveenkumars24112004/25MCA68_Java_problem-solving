package conditional_statement;

import java.util.Scanner;

public class Q08_time_validation {

	public static void main(String[] args) {
		
		// Creating Scanner object
		Scanner in = new Scanner(System.in);
		
		// Variable declaration
		int h, m;
		
		// Getting input
		System.out.print("Enter time (HH MM): ");
		h = in.nextInt();
		m = in.nextInt();
		
		// Validating time
		if(h >= 0 && h <= 23 && m >= 0 && m <= 59)
			System.out.println("Valid Time");
		else
			System.out.println("Invalid Time");
		
		// Closing Scanner
		in.close();
	}
}