package operators;

import java.util.Scanner;

public class Q05_swapping_without_ternary {

	public static void main(String[] args) {
				// object creation
			    Scanner in = new Scanner(System.in);
				
				// variable declaration
				int a, b;
				
				// getting input
				System.out.print("Enter a: ");
				a = in.nextInt();
				System.out.print("Enter b: ");
				b = in.nextInt();
				
				// process
				a = a + b;
				b = a - b;
				a = a - b;
				
				// print output
				System.out.println("After swapping:");
				System.out.println("a = " + a + ", b = " + b);
				
				// destroy object
				in.close();
			}
		}
