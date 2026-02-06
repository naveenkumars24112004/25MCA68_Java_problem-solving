package looping;

import java.util.Scanner;

public class Q03_multiplication_table {

	public static void main(String[] args) {
		
		// Creating Scanner object
				Scanner in = new Scanner(System.in);
				
				// Variable declaration
				int n;
				
				// Getting input
				System.out.print("Enter a number: ");
				n = in.nextInt();
				
				// Loop to generate multiplication table
				for(int i = 1; i <= 10; i++)
					System.out.print(n * i + " ");
				
				// Closing Scanner
				in.close();
	}

}
