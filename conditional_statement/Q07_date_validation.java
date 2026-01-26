package conditional_statement;

import java.util.Scanner;

public class Q07_date_validation {

	public static void main(String[] args) {
		
		// Creating Scanner object
		Scanner in = new Scanner(System.in);
		
		// Variable declaration
		int d, m, y;
		
		// Getting input
		System.out.print("Enter date (dd mm yyyy): ");
		d = in.nextInt();
		m = in.nextInt();
		y = in.nextInt();
		
		// Checking leap year
		boolean leap = (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
		
		int maxDays;
		
		// Determining number of days in the given month
		switch(m) {
			case 2: maxDays = leap ? 29 : 28; break;
			case 4: case 6: case 9: case 11: maxDays = 30; break;
			default: maxDays = 31;
		}
		
		// Validating date
		if(d >= 1 && d <= maxDays && m >= 1 && m <= 12)
			System.out.println("Valid Date");
		else
			System.out.println("Invalid Date");
		
		// Closing Scanner
		in.close();
	}
}
