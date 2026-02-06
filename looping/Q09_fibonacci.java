package looping;

import java.util.Scanner;

public class Q09_fibonacci {

	public static void main(String[] args) {
		
				// Creating Scanner object
				Scanner in = new Scanner(System.in);
				
				// Variable declaration
				int n, a = 0, b = 1, c;
				
				// Getting input
				System.out.print("Enter number of terms: ");
				n = in.nextInt();
				
				// Printing first two terms
				System.out.print(a + " " + b + " ");
				
				// Loop to generate Fibonacci series
				for(int i = 3; i <= n; i++) {
					c = a + b;
					System.out.print(c + " ");
					a = b;
					b = c;
				}
				
				// Closing Scanner
				in.close();

	}

}
