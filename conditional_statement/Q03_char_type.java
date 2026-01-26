package conditional_statement;

import java.util.Scanner;

public class Q03_char_type {

	public static void main(String[] args) {
		
		// Create a Scanner object to read input
		Scanner in = new Scanner(System.in);
		
		// Declare a character variable
		char ch;
		
		// Prompt the user to enter a character
		System.out.print("Enter a character: ");
		ch = in.next().charAt(0);
		
		// Check if the character is an alphabet, number, or special character
		if(Character.isLetter(ch))
			System.out.println("Alphabet");
		else if(Character.isDigit(ch))
			System.out.println("Number");
		else
			System.out.println("Special Character");
		
		// Close the scanner
		in.close();
	}
}