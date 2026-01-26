package operators;

import java.util.Scanner;

public class Q02_Positive_Negative_Zero {

	public static void main(String[] args) {
				
				// object creation
						Scanner in = new Scanner(System.in);
					
				// variable declaration or memory reservation
						int n;
						
				// getting input
						System.out.println("Enter a number: ");
						n = in.nextInt();
						
				// process the result
						String result = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
						
				// print the output
						System.out.println("Result: " + result);
				
				// destroy the scanner object
				   in.close();

	}

}
