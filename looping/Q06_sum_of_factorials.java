package looping;

import java.util.Scanner;

public class Q06_sum_of_factorials {

	public static void main(String[] args) {
		
				// Creating Scanner object
				Scanner in = new Scanner(System.in);
				
				// Variable declaration
				int n, num, sum = 0;
				
				// Getting input
				System.out.print("Enter number of values: ");
				n = in.nextInt();
				
				// Loop to calculate sum of factorials
				for(int i = 1; i <= n; i++) {
					System.out.print("Enter number " + i + ": ");
					num = in.nextInt();
					
					int fact = 1;
					for(int j = 1; j <= num; j++)
						fact *= j;
					
					sum += fact;
				}
				
				// Displaying result
				System.out.println("Sum of factorials = " + sum);
				
				// Closing Scanner
				in.close();
	}
}
