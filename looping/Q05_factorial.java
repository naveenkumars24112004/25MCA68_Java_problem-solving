package looping;

import java.util.Scanner;

public class Q05_factorial {

	public static void main(String[] args) {
		
				// Creating Scanner object
				Scanner in = new Scanner(System.in);
				
				// Variable declaration
				int n, fact = 1;
				
				// Getting input
				System.out.print("Enter a number: ");
				n = in.nextInt();
				
				// Loop to calculate factorial
				for(int i = 1; i <= n; i++)
					fact *= i;
				
				// Displaying result
				System.out.println("Factorial = " + fact);
				
				// Closing Scanner
				in.close();
	}

}
