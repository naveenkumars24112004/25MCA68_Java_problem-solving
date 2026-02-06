package looping;

import java.util.Scanner;

public class Q07_sum_even_odd {

	public static void main(String[] args) {
		
				// Creating Scanner object
				Scanner in = new Scanner(System.in);
				
				// Variable declaration
				int n, evenSum = 0, oddSum = 0;
				
				// Getting input
				System.out.print("Enter the value of n: ");
				n = in.nextInt();
				
				// Loop to calculate sums
				for(int i = 1; i <= n; i++) {
					if(i % 2 == 0)
						evenSum += i;
					else
						oddSum += i;
				}
				
				// Displaying result
				System.out.println("Sum of Even = " + evenSum);
				System.out.println("Sum of Odd = " + oddSum);
				
				// Closing Scanner
				in.close();

	}

}
