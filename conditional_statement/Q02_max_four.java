package conditional_statement;

import java.util.Scanner;

public class Q02_max_four {

	public static void main(String[] args) {
		
		// object creation
		Scanner in = new Scanner(System.in);
		
		// variable declaration
		int a, b, c, d, max;
		
		// getting input
		System.out.print("Enter four numbers: ");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		
		// process
		max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		// output
		System.out.println("Maximum: " + max);
		
		// destroy object
		in.close();
	}
}
