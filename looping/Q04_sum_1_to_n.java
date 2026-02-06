package looping;

import java.util.Scanner;

public class Q04_sum_1_to_n {

	public static void main(String[] args) {
		
		// Creating Scanner object
				Scanner in = new Scanner(System.in);
				
				// Variable declaration
				int n, sum = 0;
				
				// Getting input
				System.out.print("Enter the value of n: ");
				n = in.nextInt();
				
				// Loop to calculate sum
				for(int i = 1; i <= n; i++)
					sum += i;
				
				// Displaying result
				System.out.println("Sum = " + sum);
				
				// Closing Scanner
				in.close();
	}

}
