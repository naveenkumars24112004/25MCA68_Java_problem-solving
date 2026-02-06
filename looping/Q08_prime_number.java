package looping;

import java.util.Scanner;

public class Q08_prime_number {

	public static void main(String[] args) {
		
				// Creating Scanner object
				Scanner in = new Scanner(System.in);
				
				// Variable declaration
				int n, count = 0;
				
				// Getting input
				System.out.print("Enter a number: ");
				n = in.nextInt();
				
				// Loop to count factors
				for(int i = 1; i <= n; i++) {
					if(n % i == 0)
						count++;
				}
				
				// Checking prime condition
				if(count == 2)
					System.out.println("Prime Number");
				else
					System.out.println("Not a Prime Number");
				
				// Closing Scanner
				in.close();


	}

}
