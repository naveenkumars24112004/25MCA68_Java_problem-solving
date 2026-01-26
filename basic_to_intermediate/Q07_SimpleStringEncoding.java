package basic_to_intermediate;

import java.util.Scanner;

public class Q07_SimpleStringEncoding {

	public static void main(String[] args) {
		// Object creation
		 Scanner in = new Scanner(System.in);

		// Variable Declaration or Memory Reservation
	        String word, encoded = "";

	    // Getting Input
	        System.out.print("Enter a Five letter word: ");
	        word = in.next();

	    // Process the Result
	        for (int i = 0; i < word.length(); i++) {
	            char ch = word.charAt(i);       // get character
	            char newCh = (char)(ch - 1);    // subtract 1 from ASCII
	            encoded += newCh;               // append to encoded string
	        }

	    // Print the Output
	        System.out.println("Encoded Word: " + encoded);

	    // Destroy the scanner object
	        in.close();

	}

}
