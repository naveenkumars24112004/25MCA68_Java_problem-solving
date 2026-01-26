package operators;

import java.util.Scanner;

public class Q04_swapping {

	public static void main(String[] args) {
			
		// object creation
		Scanner in = new Scanner(System.in);
		
		// variable declaration
		int a, b, temp;
		
		// getting input
		System.out.print("Enter a: ");
		a = in.nextInt();
		System.out.print("Enter b: ");
		b = in.nextInt();
		
		// process
		temp = a;
		a = b;
		b = temp;
		
		// print output
		System.out.println("After swapping:");
		System.out.println("a = " + a + ", b = " + b);
		
		// destroy object
		in.close();
	}
}