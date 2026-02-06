package looping;

import java.util.Scanner;

public class Q01_print_1ton {

	public static void main(String[] args) {
		
		// Creating Scanner object to take input
		Scanner in = new Scanner(System.in);
		
		// Variable declaration
		int n;
		
		// Getting input
		System.out.print("Enter the value of n: ");
		n = in.nextInt();
		
		// Loop to print numbers from 1 to n
		for(int i = 1; i <= n; i++)
			System.out.print(i + " ");
		
		// Closing Scanner object
		in.close();
	}
}

