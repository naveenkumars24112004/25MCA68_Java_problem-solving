package operators;

import java.util.Scanner;

public class Q03_alphabet {

	public static void main(String[] args) {
		
				// object creation
				Scanner in = new Scanner(System.in);
				
				// variable declaration
				char ch;
				
				// getting input
				System.out.print("Enter a character: ");
				ch = in.next().charAt(0);
				
				// process
				String result = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
						        ? "Alphabet" : "Not Alphabet";
				
				// print output
				System.out.println("Result: " + result);
				
				// destroy object
				in.close();
			}
		}
