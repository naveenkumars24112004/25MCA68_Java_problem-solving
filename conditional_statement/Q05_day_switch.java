package conditional_statement;

import java.util.Scanner;

public class Q05_day_switch {

	public static void main(String[] args) {
		
		// Creating Scanner object
		Scanner in = new Scanner(System.in);
		
		// Variable declaration
		int day;
		
		// Getting input
		System.out.print("Enter day number (1 to 7): ");
		day = in.nextInt();
		
		// Using switch case to print day name
		switch(day) {
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday"); break;
			case 7: System.out.println("Sunday"); break;
			default: System.out.println("Invalid Input");
		}
		
		// Closing Scanner
		in.close();
	}
}