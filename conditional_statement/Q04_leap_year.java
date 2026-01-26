package conditional_statement;

import java.util.Scanner;

public class Q04_leap_year {

	public static void main(String[] args) {
		
		// Creating Scanner object
		Scanner in = new Scanner(System.in);
		
		// Variable declaration
		int year;
		
		// Getting input
		System.out.print("Enter a year: ");
		year = in.nextInt();
		
		// Checking leap year condition
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");
		
		// Closing Scanner
		in.close();
	}
}

