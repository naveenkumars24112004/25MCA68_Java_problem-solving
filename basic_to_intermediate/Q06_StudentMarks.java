package basic_to_intermediate;

import java.util.Scanner;

public class Q06_StudentMarks {

	public static void main(String[] args) {
		// Object creation
		 Scanner in = new Scanner(System.in);
		 
		// Variable Declaration or Memory Reservation
	        int mark1, mark2, mark3, total;
	        double average;

	    // Getting Input
	        System.out.print("Enter Mark 1: ");
	        mark1 = in.nextInt();

	        System.out.print("Enter Mark 2: ");
	        mark2 = in.nextInt();

	        System.out.print("Enter Mark 3: ");
	        mark3 = in.nextInt();

	    // Process the Result
	        total = mark1 + mark2 + mark3;
	        average = total / 3.0;

	    // Print the Output
	        System.out.printf("Total Marks   = %d%n", total);
	        System.out.printf("Average Marks = %.1f", average);

	    // Destroy the scanner object
	        in.close();

	}

}
