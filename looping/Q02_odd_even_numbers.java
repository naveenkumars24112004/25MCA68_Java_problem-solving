package looping;

import java.util.Scanner;

public class Q02_odd_even_numbers {

	public static void main(String[] args) {
		
		// Creating Scanner object
				Scanner in = new Scanner(System.in);
				
				// Variable declaration
				int n;
				
				// Getting input
				System.out.print("Enter the value of n: ");
				n = in.nextInt();
				
				// Printing odd numbers
				System.out.print("Odd Numbers: ");
				for(int i = 1; i <= n; i++) {
					if(i % 2 != 0)
						System.out.print(i + " ");
				}
				
				// Printing even numbers
				System.out.print("\nEven Numbers: ");
				for(int i = 1; i <= n; i++) {
					if(i % 2 == 0)
						System.out.print(i + " ");
				}
				
				// Closing Scanner
				in.close();
	}

}
