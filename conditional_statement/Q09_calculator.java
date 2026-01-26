package conditional_statement;

import java.util.Scanner;

public class Q09_calculator {

	public static void main(String[] args) {
		
		// Creating Scanner object
		Scanner in = new Scanner(System.in);
		
		// Variable declaration
		int a, b;
		char op;
		
		// Getting input
		System.out.print("Enter expression (a + b): ");
		a = in.nextInt();
		op = in.next().charAt(0);
		b = in.nextInt();
		
		// Performing calculation using switch
		switch(op) {
			case '+': System.out.println("Result = " + (a + b)); break;
			case '-': System.out.println("Result = " + (a - b)); break;
			case '*': System.out.println("Result = " + (a * b)); break;
			case '/': System.out.println("Result = " + (a / b)); break;
			default: System.out.println("Invalid Operator");
		}
		
		// Closing Scanner
		in.close();
	}
}
