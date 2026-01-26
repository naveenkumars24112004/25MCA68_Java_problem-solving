package conditional_statement;

import java.util.Scanner;

public class Q01_OddorEven {

	public static void main(String[] args) {
				// object creation
				Scanner in = new Scanner(System.in);
				
				// variable declaration
				int n;
				
				// getting input
				System.out.print("Enter a number: ");
				n = in.nextInt();
				
				// process
				if(n % 2 == 0)
					System.out.println("Even");
				else
					System.out.println("Odd");
				
				// destroy object
				in.close();
			}
		}

