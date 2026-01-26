package operators;

import java.util.Scanner;

public class Q06_OddOrEven {

	public static void main(String[] args) {
		
				// object creation
				Scanner in = new Scanner(System.in);
				
				// variable declaration
				int n;
				
				// getting input
				System.out.print("Enter a number: ");
				n = in.nextInt();
				
				// process
				String result = (n % 2 == 0) ? "Even" : "Odd";
				
				// print output
				System.out.println("Result: " + result);
				
				// destroy object
				in.close();
			}
		}

