package conditional_statement;

import java.util.Scanner;

public class Q06_triangle {

	public static void main(String[] args) {
		
		// Creating Scanner object
		Scanner in = new Scanner(System.in);
		
		// Variable declaration
		int a, b, c;
		
		// Getting input
		System.out.print("Enter three sides: ");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		// Checking triangle condition
		if(a + b > c && a + c > b && b + c > a)
			System.out.println("Triangle is possible");
		else
			System.out.println("Triangle is not possible");
		
		// Closing Scanner
		in.close();
	}
}